package kg.megacom.adverts.services.impl;

import kg.megacom.adverts.microservice.FileServiceFeign;
import kg.megacom.adverts.microservice.object.Response;
import kg.megacom.adverts.models.dto.TvChannelDto;
import kg.megacom.adverts.services.FileService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;
@Service
public class FileServiceImpl implements FileService {
    @Autowired
    private FileServiceFeign fileServiceFeign;
    @Autowired
    private TvChannelServicesImpl tvChannelServices;

    @Override
    public TvChannelDto uploadLogo(Long id, MultipartFile file) {
        TvChannelDto tvChannelDto = tvChannelServices.findById(id);

        Response response = fileServiceFeign.upload(file);

        tvChannelDto.setLogo((response.getDownloadUri()));

        tvChannelDto = tvChannelServices.update(tvChannelDto);

        return tvChannelDto;
    }
}
