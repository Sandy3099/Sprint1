package com.cg.sprint1.mvtktapp.sample.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cg.sprint1.mvtktapp.sample.repository.BookedSeatRepository;
@Service
public class BookedSeatService 
{
	@Autowired
	BookedSeatRepository bookedSeatRepository;
}
