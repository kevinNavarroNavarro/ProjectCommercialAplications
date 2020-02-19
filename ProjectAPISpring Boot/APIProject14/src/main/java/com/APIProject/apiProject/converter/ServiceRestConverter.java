package com.APIProject.apiProject.converter;

import com.APIProject.apiProject.domain.business.SService;
import com.APIProject.apiProject.dto.ServiceDTO;
import org.springframework.stereotype.Service;

@Service
public class ServiceRestConverter implements RestConverter<SService, ServiceDTO.Response, ServiceDTO.Request> {


    @Override
    public ServiceDTO.Response toResponse(SService entity) {
        ServiceDTO.Response dto = new ServiceDTO.Response();
        dto.setId(entity.getId());
        dto.setName(entity.getName());
        return dto;
    }

    @Override
    public SService fromRequest(ServiceDTO.Request dto) {
        SService entity = new SService();
        entity.setId(dto.getId());
        entity.setName(dto.getName());
        return entity;
    }
}
