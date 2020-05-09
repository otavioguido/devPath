package com.osilva.service;

import com.osilva.model.Im;
import com.osilva.model.User;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;

public interface ImService {
  void saveIm(Im im);

  Page<Im> findAllIms(Pageable pageable);

  Page<Im> findByUser(User user, PageRequest pageRequest);

  Im findImChat(User user, User contact);

  void deleteIm(Im im);
}
