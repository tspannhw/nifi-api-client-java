/*
 * NiFi Rest Api
 * The Rest Api provides programmatic access to command and control a NiFi instance in real time. Start and                                              stop processors, monitor queues, query provenance data, and more. Each endpoint below includes a description,                                             definitions of the expected input and output, potential response codes, and the authorizations required                                             to invoke each service.
 *
 * OpenAPI spec version: 1.0.0
 * Contact: dev@nifi.apache.org
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */


package io.swagger.client.model;

import java.util.Objects;
import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.client.model.ProvenanceSearchableFieldDTO;
import java.util.ArrayList;
import java.util.List;

/**
 * ProvenanceOptionsDTO
 */
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2016-10-14T11:52:34.905+11:00")
public class ProvenanceOptionsDTO {
  @SerializedName("searchableFields")
  private List<ProvenanceSearchableFieldDTO> searchableFields = new ArrayList<ProvenanceSearchableFieldDTO>();

  public ProvenanceOptionsDTO searchableFields(List<ProvenanceSearchableFieldDTO> searchableFields) {
    this.searchableFields = searchableFields;
    return this;
  }

  public ProvenanceOptionsDTO addSearchableFieldsItem(ProvenanceSearchableFieldDTO searchableFieldsItem) {
    this.searchableFields.add(searchableFieldsItem);
    return this;
  }

   /**
   * The available searchable field for the NiFi.
   * @return searchableFields
  **/
  @ApiModelProperty(example = "null", value = "The available searchable field for the NiFi.")
  public List<ProvenanceSearchableFieldDTO> getSearchableFields() {
    return searchableFields;
  }

  public void setSearchableFields(List<ProvenanceSearchableFieldDTO> searchableFields) {
    this.searchableFields = searchableFields;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ProvenanceOptionsDTO provenanceOptionsDTO = (ProvenanceOptionsDTO) o;
    return Objects.equals(this.searchableFields, provenanceOptionsDTO.searchableFields);
  }

  @Override
  public int hashCode() {
    return Objects.hash(searchableFields);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ProvenanceOptionsDTO {\n");
    
    sb.append("    searchableFields: ").append(toIndentedString(searchableFields)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
  
}

