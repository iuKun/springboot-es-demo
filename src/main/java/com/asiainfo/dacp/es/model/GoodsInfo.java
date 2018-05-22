package com.asiainfo.dacp.es.model;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.elasticsearch.annotations.Document;

import java.io.Serializable;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Document(indexName = "test", type = "goods")
public class GoodsInfo implements Serializable {

    private Long id;
    private String name;
    private String desc;
}

