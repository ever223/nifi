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
package org.apache.nifi.web.api.dto.provenance;

import com.wordnik.swagger.annotations.ApiModelProperty;
import java.util.List;
import javax.xml.bind.annotation.XmlType;

/**
 * A provenance search options.
 */
@XmlType(name = "provenanceOptions")
public class ProvenanceOptionsDTO {

    private List<ProvenanceSearchableFieldDTO> searchableFields;

    /**
     * @return available searchable fields for this NiFi instance
     */
    @ApiModelProperty(
            value = "The available searchable field for the NiFi."
    )
    public List<ProvenanceSearchableFieldDTO> getSearchableFields() {
        return searchableFields;
    }

    public void setSearchableFields(List<ProvenanceSearchableFieldDTO> searchableFields) {
        this.searchableFields = searchableFields;
    }

}