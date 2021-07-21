package kg.megacom.adverts.services;

import kg.megacom.adverts.models.dto.TvChannelDto;
import org.springframework.web.multipart.MultipartFile;

public interface FileService {

    TvChannelDto uploadLogo(Long id, MultipartFile file);
}
