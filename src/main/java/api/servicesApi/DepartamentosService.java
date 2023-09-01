package api.servicesApi;

import api.model.DptoResponse;

import com.crowdar.api.rest.Response;


public class DepartamentosService extends BaseService {


    public static Response get(String jsonName) {return get(jsonName, DptoResponse.class,setParams());
    }


}
