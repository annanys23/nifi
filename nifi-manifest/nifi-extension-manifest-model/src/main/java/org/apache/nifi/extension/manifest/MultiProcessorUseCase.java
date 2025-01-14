/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.apache.nifi.extension.manifest;

import io.swagger.annotations.ApiModel;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import java.util.List;

@ApiModel
@XmlAccessorType(XmlAccessType.FIELD)
public class MultiProcessorUseCase {
    private String description;

    private String notes;

    @XmlElementWrapper
    @XmlElement(name = "keyword")
    private List<String> keywords;

    @XmlElementWrapper
    @XmlElement(name = "processorConfiguration")
    private List<ProcessorConfiguration> processorConfigurations;


    public String getDescription() {
        return description;
    }

    public void setDescription(final String description) {
        this.description = description;
    }

    public String getNotes() {
        return notes;
    }

    public void setNotes(final String notes) {
        this.notes = notes;
    }

    public List<String> getKeywords() {
        return keywords;
    }

    public void setKeywords(final List<String> keywords) {
        this.keywords = keywords;
    }

    public List<ProcessorConfiguration> getProcessorConfigurations() {
        return processorConfigurations;
    }

    public void setProcessorConfigurations(final List<ProcessorConfiguration> processorConfigurations) {
        this.processorConfigurations = processorConfigurations;
    }
}
