package com.team2.azcendapi.services;

import com.team2.azcendapi.model.GeneralLedger;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;

public interface GeneralLedgerService {

    List<GeneralLedger> importGL(MultipartFile file);
}
