package com.example.veiwmodel;

import android.arch.lifecycle.LiveData;
import android.arch.lifecycle.MutableLiveData;

import java.util.ArrayList;

import io.reactivex.Observer;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.disposables.Disposable;
import io.reactivex.schedulers.Schedulers;

public class ViewModel extends android.arch.lifecycle.ViewModel {

    private MutableLiveData<PostResponseModel> postResponseModelMutableLiveData;
    private RequestModel requestModel;

    public LiveData<PostResponseModel> getData(){
        if(postResponseModelMutableLiveData == null){
            postResponseModelMutableLiveData = new MutableLiveData<PostResponseModel>();
            requestModel = new RequestModel("Space Elevator, Mars Hyperloop, Space Model S (Model Space?)","Space Travel Ideas","note");
            loadData(requestModel);
        }
        return postResponseModelMutableLiveData;
    }

    private void loadData(RequestModel requestModel) {
        RetrofitService retrofitService = RetrofitlClient.getClient().create(RetrofitService.class);
        retrofitService.getData(requestModel)
                .observeOn(AndroidSchedulers.mainThread())
                .subscribeOn(Schedulers.io())
                .subscribe(new Observer<PostResponseModel>() {
                    @Override
                    public void onSubscribe(Disposable d) {

                    }

                    @Override
                    public void onNext(PostResponseModel postResponseModel) {
                        postResponseModelMutableLiveData.setValue(postResponseModel);
                    }

                    @Override
                    public void onError(Throwable e) {

                    }

                    @Override
                    public void onComplete() {

                    }
                });
    }

/*    private MutableLiveData<ArrayList<Responsemodel>> responseModel;
    private RetrofitlClient retrofitlClient;

    public LiveData<ArrayList<Responsemodel>> getData(){

        if(responseModel == null){
            responseModel = new MutableLiveData<ArrayList<Responsemodel>>();
            loadData();
        }
        return responseModel;
    }

    private void loadData() {
        RetrofitService retrofitService = RetrofitlClient.getClient().create(RetrofitService.class);
        retrofitService.getResponse()
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(new Observer<ArrayList<Responsemodel>>() {
                    @Override
                    public void onSubscribe(Disposable d) {

                    }

                    @Override
                    public void onNext(ArrayList<Responsemodel> responsemodels) {
                        responseModel.setValue(responsemodels);
                    }

                    @Override
                    public void onError(Throwable e) {

                    }

                    @Override
                    public void onComplete() {

                    }
                });
    }*/
}
