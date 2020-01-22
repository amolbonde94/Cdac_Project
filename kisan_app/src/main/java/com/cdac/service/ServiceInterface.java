package com.cdac.service;

import com.cdac.dto.User;

public interface ServiceInterface {
      User login(User user);
      boolean create(User user);
}
