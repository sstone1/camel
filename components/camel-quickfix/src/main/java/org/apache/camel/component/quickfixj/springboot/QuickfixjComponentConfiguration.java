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
package org.apache.camel.component.quickfixj.springboot;

import java.util.Map;
import org.apache.camel.component.quickfixj.QuickfixjConfiguration;
import org.springframework.boot.context.properties.ConfigurationProperties;
import quickfix.LogFactory;
import quickfix.MessageFactory;
import quickfix.MessageStoreFactory;

/**
 * The quickfix component allows to send Financial Interchange (FIX) messages to
 * the QuickFix engine.
 * 
 * Generated by camel-package-maven-plugin - do not edit this file!
 */
@ConfigurationProperties(prefix = "camel.component.quickfix")
public class QuickfixjComponentConfiguration {

    /**
     * To use the given MessageFactory
     */
    private MessageFactory messageFactory;
    /**
     * To use the given LogFactory
     */
    private LogFactory logFactory;
    /**
     * To use the given MessageStoreFactory
     */
    private MessageStoreFactory messageStoreFactory;
    /**
     * To use the given map of pre configured QuickFix configurations mapped to
     * the key
     */
    private Map<java.lang.String, org.apache.camel.component.quickfixj.QuickfixjConfiguration> configurations;
    /**
     * If set to true the engines will be created and started when needed (when
     * first message is send)
     */
    private boolean lazyCreateEngines;

    public MessageFactory getMessageFactory() {
        return messageFactory;
    }

    public void setMessageFactory(MessageFactory messageFactory) {
        this.messageFactory = messageFactory;
    }

    public LogFactory getLogFactory() {
        return logFactory;
    }

    public void setLogFactory(LogFactory logFactory) {
        this.logFactory = logFactory;
    }

    public MessageStoreFactory getMessageStoreFactory() {
        return messageStoreFactory;
    }

    public void setMessageStoreFactory(MessageStoreFactory messageStoreFactory) {
        this.messageStoreFactory = messageStoreFactory;
    }

    public Map<String, QuickfixjConfiguration> getConfigurations() {
        return configurations;
    }

    public void setConfigurations(
            Map<String, QuickfixjConfiguration> configurations) {
        this.configurations = configurations;
    }

    public boolean isLazyCreateEngines() {
        return lazyCreateEngines;
    }

    public void setLazyCreateEngines(boolean lazyCreateEngines) {
        this.lazyCreateEngines = lazyCreateEngines;
    }
}