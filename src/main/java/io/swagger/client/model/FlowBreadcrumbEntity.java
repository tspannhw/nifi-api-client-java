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
import io.swagger.client.model.FlowBreadcrumbDTO;
import io.swagger.client.model.PermissionsDTO;

/**
 * FlowBreadcrumbEntity
 */
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2016-10-14T11:52:34.905+11:00")
public class FlowBreadcrumbEntity {
  @SerializedName("id")
  private String id = null;

  @SerializedName("permissions")
  private PermissionsDTO permissions = null;

  @SerializedName("breadcrumb")
  private FlowBreadcrumbDTO breadcrumb = null;

  public FlowBreadcrumbEntity id(String id) {
    this.id = id;
    return this;
  }

   /**
   * The id of this ancestor ProcessGroup.
   * @return id
  **/
  @ApiModelProperty(example = "null", value = "The id of this ancestor ProcessGroup.")
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public FlowBreadcrumbEntity permissions(PermissionsDTO permissions) {
    this.permissions = permissions;
    return this;
  }

   /**
   * The permissions for this ancestor ProcessGroup.
   * @return permissions
  **/
  @ApiModelProperty(example = "null", value = "The permissions for this ancestor ProcessGroup.")
  public PermissionsDTO getPermissions() {
    return permissions;
  }

  public void setPermissions(PermissionsDTO permissions) {
    this.permissions = permissions;
  }

  public FlowBreadcrumbEntity breadcrumb(FlowBreadcrumbDTO breadcrumb) {
    this.breadcrumb = breadcrumb;
    return this;
  }

   /**
   * This breadcrumb.
   * @return breadcrumb
  **/
  @ApiModelProperty(example = "null", value = "This breadcrumb.")
  public FlowBreadcrumbDTO getBreadcrumb() {
    return breadcrumb;
  }

  public void setBreadcrumb(FlowBreadcrumbDTO breadcrumb) {
    this.breadcrumb = breadcrumb;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FlowBreadcrumbEntity flowBreadcrumbEntity = (FlowBreadcrumbEntity) o;
    return Objects.equals(this.id, flowBreadcrumbEntity.id) &&
        Objects.equals(this.permissions, flowBreadcrumbEntity.permissions) &&
        Objects.equals(this.breadcrumb, flowBreadcrumbEntity.breadcrumb);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, permissions, breadcrumb);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FlowBreadcrumbEntity {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    permissions: ").append(toIndentedString(permissions)).append("\n");
    sb.append("    breadcrumb: ").append(toIndentedString(breadcrumb)).append("\n");
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

