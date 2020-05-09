package com.osilva.service;

import com.osilva.model.Im;
import com.osilva.model.User;
import com.osilva.repository.ImRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class ImServiceImpl implements ImService {
  @Autowired
  private ImRepository imRepository;

  @Override
  public void saveIm(Im im){
    imRepository.saveAndFlush(im);
  }

  @Override
  public Page<Im> findAllIms(Pageable pageable){
    return imRepository.findAll(pageable);
  }

  @Override
  public Page<Im> findByUser(User user, PageRequest pageRequest){
    return imRepository.findByUsers(user, pageRequest);
  }

  @Override
  public Im findImChat(User user, User contact){
    return imRepository.findByUsersAndUsers(user, contact);
  }

  @Override
  public void deleteIm(Im im){
    imRepository.delete(im);
  }
}
