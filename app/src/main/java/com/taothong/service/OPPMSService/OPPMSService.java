package com.taothong.service.OPPMSService;

import com.taothong.service.OPPMSService.OPPMSDAO.OPPMSDAO;

import retrofit2.Call;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.POST;

/**
 * Created by suriyataothongkom on 3/17/2017 AD.
 */

public interface OPPMSService {


    @POST("index.php/OPPMS/service_android/graph_cycle")
    Call<OPPMSDAO> getOPPMSData();


    @FormUrlEncoded
    @POST("index.php/OPPMS/service_android/send_quick")
    Call<SendQuick> sendData(@Field("id") String id,
                             @Field("name")String name);



}
