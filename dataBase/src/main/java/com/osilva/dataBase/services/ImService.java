package com.osilva.dataBase.services;

import com.osilva.dataBase.models.IM;
import com.osilva.dataBase.repositories.ImRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ImService {
  @Autowired
  ImRepository imRepository;

  public void saveIm(IM im){ imRepository.save(im); }

  public Iterable<IM> getImsFromUser(Iterable<Long> ids){ return imRepository.findAllById(ids); }

  public Iterable<IM> getAllIms() { return imRepository.findAll(); }
}
