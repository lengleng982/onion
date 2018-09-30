package com.onion.core.entity.model;

import com.onion.core.entity.Created;
import com.onion.core.entity.Id;
import com.onion.core.entity.Modified;
import com.onion.core.entity.Version;

/**
 * 默认常用Model聚合接口
 */
public interface Model extends Id<String>, Version, Created, Modified {

}