package com.wmtbr.xtrack.requestApi;

import com.wmtbr.xtrack.models.PojoList;
import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface DataService {

    @GET("retrofit-demo.php")
    Call<PojoList> getEmployeeData(@Query("company_no") int companyNo);

}