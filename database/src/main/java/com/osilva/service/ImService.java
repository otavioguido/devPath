package com.osilva.service;

import com.osilva.model.Im;
import com.osilva.model.User;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;

import java.util.Set;

public interface ImService {
  void saveIm(Im im);

  Page<Im> findAllIms(Pageable pageable);

  void deleteIm(Im im);
}
