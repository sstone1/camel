/**
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.apache.camel.component.box.springboot;

import java.util.HashMap;
import java.util.Map;
import org.apache.camel.CamelContext;
import org.apache.camel.component.box.BoxComponent;
import org.apache.camel.util.IntrospectionSupport;
import org.springframework.boot.autoconfigure.condition.ConditionalOnClass;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Generated by camel-package-maven-plugin - do not edit this file!
 */
@Configuration
@EnableConfigurationProperties(BoxComponentConfiguration.class)
public class BoxComponentAutoConfiguration {

    @Bean
    @ConditionalOnClass(CamelContext.class)
    @ConditionalOnMissingBean(BoxComponent.class)
    public BoxComponent configureComponent(CamelContext camelContext,
            BoxComponentConfiguration configuration) throws Exception {
        BoxComponent component = new BoxComponent();
        component.setCamelContext(camelContext);
        Map<String, Object> parameters = new HashMap<>();
        IntrospectionSupport.getProperties(configuration, parameters, null);
        IntrospectionSupport.setProperties(camelContext,
                camelContext.getTypeConverter(), component, parameters);
        return component;
    }
}