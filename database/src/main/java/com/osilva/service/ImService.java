package com.osilva.service;

import com.osilva.model.Im;
import com.osilva.model.User;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface ImService {
  void saveIm(Im im);

  Page<Im> findAllIms(Pageable pageable);

  Im findByUser(User user);

  Im findImChat(User user, User contact);

  void deleteIm(Im im);
}
