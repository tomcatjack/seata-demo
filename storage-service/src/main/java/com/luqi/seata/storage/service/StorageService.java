package com.luqi.seata.storage.service;

/**
 * @author jianjun.ren
 * @since 2021/02/16
 */
public interface StorageService {

    boolean updateUseNum(long productId , long used);
}
