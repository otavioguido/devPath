package com.osilva.service;

import com.osilva.model.Im;
import com.osilva.repository.ImRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

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
  public void deleteIm(Im im){
    imRepository.delete(im);
  }
}
