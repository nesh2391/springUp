package com.twang.usersController;

import java.util.List;

import com.twang.util.OrderedPair;

public interface UserActions<K, V> {

	public OrderedPair<String, List> getUsers();
}
