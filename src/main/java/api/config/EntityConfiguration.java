package api.config;

import  api.servicesApi.DepartamentosService;

public enum EntityConfiguration {

    DPTO {
        @Override
        public Class<?> getEntityService() {
            return DepartamentosService.class;
        }

    };



    public abstract Class<?> getEntityService();
}
