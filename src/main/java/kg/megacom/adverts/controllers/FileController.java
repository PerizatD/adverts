package kg.megacom.adverts.controllers;

import kg.megacom.adverts.models.dto.TvChannelDto;
import kg.megacom.adverts.services.FileService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

@RestController
@RequestMapping(value = "/api/v1/file")
public class FileController {

    @Autowired
    private FileService fileService;

    @RequestMapping(value = "/logo", method =  RequestMethod.POST)
    public TvChannelDto uploadLogo(@RequestParam Long tvChannelId, @RequestPart MultipartFile file){
        return fileService.uploadLogo(tvChannelId, file);
    }
}
