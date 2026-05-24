package com.ecommerce.searchengine.configuration;

import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.data.elasticsearch.client.ClientConfiguration;
import org.springframework.data.elasticsearch.client.elc.ElasticsearchConfiguration;

@Configurable
public class ElasticConfig extends ElasticsearchConfiguration {

    @Override
    public ClientConfiguration clientConfiguration() {
        return ClientConfiguration.builder()
            .connectedTo("localhost:9200") // Replace with your cluster URL
            // .usingSsl() // Uncomment if SSL is enabled (required for ES 8+)
            // .withBasicAuth("username", "password")
            .build();
    }
}
