package com.asiainfo.dacp.es.repo;

import com.asiainfo.dacp.es.model.GoodsInfo;
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;
import org.springframework.stereotype.Component;

@Component
public interface GoodsRepo extends ElasticsearchRepository<GoodsInfo, Long> {
}
