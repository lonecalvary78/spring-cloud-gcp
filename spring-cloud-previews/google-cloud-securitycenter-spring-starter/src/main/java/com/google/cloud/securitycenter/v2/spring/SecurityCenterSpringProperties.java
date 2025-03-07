/*
 * Copyright 2025 Google LLC
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.google.cloud.securitycenter.v2.spring;

import com.google.api.core.BetaApi;
import com.google.cloud.spring.core.Credentials;
import com.google.cloud.spring.core.CredentialsSupplier;
import com.google.cloud.spring.core.Retry;
import javax.annotation.Generated;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.context.properties.NestedConfigurationProperty;

// AUTO-GENERATED DOCUMENTATION AND CLASS.
/** Provides default property values for SecurityCenter client bean */
@Generated("by google-cloud-spring-generator")
@BetaApi("Autogenerated Spring autoconfiguration is not yet stable")
@ConfigurationProperties("com.google.cloud.securitycenter.v2.security-center")
public class SecurityCenterSpringProperties implements CredentialsSupplier {
  /** OAuth2 credentials to authenticate and authorize calls to Google Cloud Client Libraries. */
  @NestedConfigurationProperty
  private final Credentials credentials =
      new Credentials("https://www.googleapis.com/auth/cloud-platform");
  /** Quota project to use for billing. */
  private String quotaProjectId;
  /** Number of threads used for executors. */
  private Integer executorThreadCount;
  /** Allow override of default transport channel provider to use REST instead of gRPC. */
  private boolean useRest = false;
  /** Allow override of retry settings at service level, applying to all of its RPC methods. */
  @NestedConfigurationProperty private Retry retry;
  /**
   * Allow override of retry settings at method-level for batchCreateResourceValueConfigs. If
   * defined, this takes precedence over service-level retry configurations for that RPC method.
   */
  @NestedConfigurationProperty private Retry batchCreateResourceValueConfigsRetry;
  /**
   * Allow override of retry settings at method-level for createBigQueryExport. If defined, this
   * takes precedence over service-level retry configurations for that RPC method.
   */
  @NestedConfigurationProperty private Retry createBigQueryExportRetry;
  /**
   * Allow override of retry settings at method-level for createFinding. If defined, this takes
   * precedence over service-level retry configurations for that RPC method.
   */
  @NestedConfigurationProperty private Retry createFindingRetry;
  /**
   * Allow override of retry settings at method-level for createMuteConfig. If defined, this takes
   * precedence over service-level retry configurations for that RPC method.
   */
  @NestedConfigurationProperty private Retry createMuteConfigRetry;
  /**
   * Allow override of retry settings at method-level for createNotificationConfig. If defined, this
   * takes precedence over service-level retry configurations for that RPC method.
   */
  @NestedConfigurationProperty private Retry createNotificationConfigRetry;
  /**
   * Allow override of retry settings at method-level for createSource. If defined, this takes
   * precedence over service-level retry configurations for that RPC method.
   */
  @NestedConfigurationProperty private Retry createSourceRetry;
  /**
   * Allow override of retry settings at method-level for deleteBigQueryExport. If defined, this
   * takes precedence over service-level retry configurations for that RPC method.
   */
  @NestedConfigurationProperty private Retry deleteBigQueryExportRetry;
  /**
   * Allow override of retry settings at method-level for deleteMuteConfig. If defined, this takes
   * precedence over service-level retry configurations for that RPC method.
   */
  @NestedConfigurationProperty private Retry deleteMuteConfigRetry;
  /**
   * Allow override of retry settings at method-level for deleteNotificationConfig. If defined, this
   * takes precedence over service-level retry configurations for that RPC method.
   */
  @NestedConfigurationProperty private Retry deleteNotificationConfigRetry;
  /**
   * Allow override of retry settings at method-level for deleteResourceValueConfig. If defined,
   * this takes precedence over service-level retry configurations for that RPC method.
   */
  @NestedConfigurationProperty private Retry deleteResourceValueConfigRetry;
  /**
   * Allow override of retry settings at method-level for getBigQueryExport. If defined, this takes
   * precedence over service-level retry configurations for that RPC method.
   */
  @NestedConfigurationProperty private Retry getBigQueryExportRetry;
  /**
   * Allow override of retry settings at method-level for getSimulation. If defined, this takes
   * precedence over service-level retry configurations for that RPC method.
   */
  @NestedConfigurationProperty private Retry getSimulationRetry;
  /**
   * Allow override of retry settings at method-level for getValuedResource. If defined, this takes
   * precedence over service-level retry configurations for that RPC method.
   */
  @NestedConfigurationProperty private Retry getValuedResourceRetry;
  /**
   * Allow override of retry settings at method-level for getIamPolicy. If defined, this takes
   * precedence over service-level retry configurations for that RPC method.
   */
  @NestedConfigurationProperty private Retry getIamPolicyRetry;
  /**
   * Allow override of retry settings at method-level for getMuteConfig. If defined, this takes
   * precedence over service-level retry configurations for that RPC method.
   */
  @NestedConfigurationProperty private Retry getMuteConfigRetry;
  /**
   * Allow override of retry settings at method-level for getNotificationConfig. If defined, this
   * takes precedence over service-level retry configurations for that RPC method.
   */
  @NestedConfigurationProperty private Retry getNotificationConfigRetry;
  /**
   * Allow override of retry settings at method-level for getResourceValueConfig. If defined, this
   * takes precedence over service-level retry configurations for that RPC method.
   */
  @NestedConfigurationProperty private Retry getResourceValueConfigRetry;
  /**
   * Allow override of retry settings at method-level for getSource. If defined, this takes
   * precedence over service-level retry configurations for that RPC method.
   */
  @NestedConfigurationProperty private Retry getSourceRetry;
  /**
   * Allow override of retry settings at method-level for groupFindings. If defined, this takes
   * precedence over service-level retry configurations for that RPC method.
   */
  @NestedConfigurationProperty private Retry groupFindingsRetry;
  /**
   * Allow override of retry settings at method-level for listAttackPaths. If defined, this takes
   * precedence over service-level retry configurations for that RPC method.
   */
  @NestedConfigurationProperty private Retry listAttackPathsRetry;
  /**
   * Allow override of retry settings at method-level for listBigQueryExports. If defined, this
   * takes precedence over service-level retry configurations for that RPC method.
   */
  @NestedConfigurationProperty private Retry listBigQueryExportsRetry;
  /**
   * Allow override of retry settings at method-level for listFindings. If defined, this takes
   * precedence over service-level retry configurations for that RPC method.
   */
  @NestedConfigurationProperty private Retry listFindingsRetry;
  /**
   * Allow override of retry settings at method-level for listMuteConfigs. If defined, this takes
   * precedence over service-level retry configurations for that RPC method.
   */
  @NestedConfigurationProperty private Retry listMuteConfigsRetry;
  /**
   * Allow override of retry settings at method-level for listNotificationConfigs. If defined, this
   * takes precedence over service-level retry configurations for that RPC method.
   */
  @NestedConfigurationProperty private Retry listNotificationConfigsRetry;
  /**
   * Allow override of retry settings at method-level for listResourceValueConfigs. If defined, this
   * takes precedence over service-level retry configurations for that RPC method.
   */
  @NestedConfigurationProperty private Retry listResourceValueConfigsRetry;
  /**
   * Allow override of retry settings at method-level for listSources. If defined, this takes
   * precedence over service-level retry configurations for that RPC method.
   */
  @NestedConfigurationProperty private Retry listSourcesRetry;
  /**
   * Allow override of retry settings at method-level for listValuedResources. If defined, this
   * takes precedence over service-level retry configurations for that RPC method.
   */
  @NestedConfigurationProperty private Retry listValuedResourcesRetry;
  /**
   * Allow override of retry settings at method-level for setFindingState. If defined, this takes
   * precedence over service-level retry configurations for that RPC method.
   */
  @NestedConfigurationProperty private Retry setFindingStateRetry;
  /**
   * Allow override of retry settings at method-level for setIamPolicy. If defined, this takes
   * precedence over service-level retry configurations for that RPC method.
   */
  @NestedConfigurationProperty private Retry setIamPolicyRetry;
  /**
   * Allow override of retry settings at method-level for setMute. If defined, this takes precedence
   * over service-level retry configurations for that RPC method.
   */
  @NestedConfigurationProperty private Retry setMuteRetry;
  /**
   * Allow override of retry settings at method-level for testIamPermissions. If defined, this takes
   * precedence over service-level retry configurations for that RPC method.
   */
  @NestedConfigurationProperty private Retry testIamPermissionsRetry;
  /**
   * Allow override of retry settings at method-level for updateBigQueryExport. If defined, this
   * takes precedence over service-level retry configurations for that RPC method.
   */
  @NestedConfigurationProperty private Retry updateBigQueryExportRetry;
  /**
   * Allow override of retry settings at method-level for updateExternalSystem. If defined, this
   * takes precedence over service-level retry configurations for that RPC method.
   */
  @NestedConfigurationProperty private Retry updateExternalSystemRetry;
  /**
   * Allow override of retry settings at method-level for updateFinding. If defined, this takes
   * precedence over service-level retry configurations for that RPC method.
   */
  @NestedConfigurationProperty private Retry updateFindingRetry;
  /**
   * Allow override of retry settings at method-level for updateMuteConfig. If defined, this takes
   * precedence over service-level retry configurations for that RPC method.
   */
  @NestedConfigurationProperty private Retry updateMuteConfigRetry;
  /**
   * Allow override of retry settings at method-level for updateNotificationConfig. If defined, this
   * takes precedence over service-level retry configurations for that RPC method.
   */
  @NestedConfigurationProperty private Retry updateNotificationConfigRetry;
  /**
   * Allow override of retry settings at method-level for updateResourceValueConfig. If defined,
   * this takes precedence over service-level retry configurations for that RPC method.
   */
  @NestedConfigurationProperty private Retry updateResourceValueConfigRetry;
  /**
   * Allow override of retry settings at method-level for updateSecurityMarks. If defined, this
   * takes precedence over service-level retry configurations for that RPC method.
   */
  @NestedConfigurationProperty private Retry updateSecurityMarksRetry;
  /**
   * Allow override of retry settings at method-level for updateSource. If defined, this takes
   * precedence over service-level retry configurations for that RPC method.
   */
  @NestedConfigurationProperty private Retry updateSourceRetry;

  @Override
  public Credentials getCredentials() {
    return this.credentials;
  }

  public String getQuotaProjectId() {
    return this.quotaProjectId;
  }

  public void setQuotaProjectId(String quotaProjectId) {
    this.quotaProjectId = quotaProjectId;
  }

  public boolean getUseRest() {
    return this.useRest;
  }

  public void setUseRest(boolean useRest) {
    this.useRest = useRest;
  }

  public Integer getExecutorThreadCount() {
    return this.executorThreadCount;
  }

  public void setExecutorThreadCount(Integer executorThreadCount) {
    this.executorThreadCount = executorThreadCount;
  }

  public Retry getRetry() {
    return this.retry;
  }

  public void setRetry(Retry retry) {
    this.retry = retry;
  }

  public Retry getBatchCreateResourceValueConfigsRetry() {
    return this.batchCreateResourceValueConfigsRetry;
  }

  public void setBatchCreateResourceValueConfigsRetry(Retry batchCreateResourceValueConfigsRetry) {
    this.batchCreateResourceValueConfigsRetry = batchCreateResourceValueConfigsRetry;
  }

  public Retry getCreateBigQueryExportRetry() {
    return this.createBigQueryExportRetry;
  }

  public void setCreateBigQueryExportRetry(Retry createBigQueryExportRetry) {
    this.createBigQueryExportRetry = createBigQueryExportRetry;
  }

  public Retry getCreateFindingRetry() {
    return this.createFindingRetry;
  }

  public void setCreateFindingRetry(Retry createFindingRetry) {
    this.createFindingRetry = createFindingRetry;
  }

  public Retry getCreateMuteConfigRetry() {
    return this.createMuteConfigRetry;
  }

  public void setCreateMuteConfigRetry(Retry createMuteConfigRetry) {
    this.createMuteConfigRetry = createMuteConfigRetry;
  }

  public Retry getCreateNotificationConfigRetry() {
    return this.createNotificationConfigRetry;
  }

  public void setCreateNotificationConfigRetry(Retry createNotificationConfigRetry) {
    this.createNotificationConfigRetry = createNotificationConfigRetry;
  }

  public Retry getCreateSourceRetry() {
    return this.createSourceRetry;
  }

  public void setCreateSourceRetry(Retry createSourceRetry) {
    this.createSourceRetry = createSourceRetry;
  }

  public Retry getDeleteBigQueryExportRetry() {
    return this.deleteBigQueryExportRetry;
  }

  public void setDeleteBigQueryExportRetry(Retry deleteBigQueryExportRetry) {
    this.deleteBigQueryExportRetry = deleteBigQueryExportRetry;
  }

  public Retry getDeleteMuteConfigRetry() {
    return this.deleteMuteConfigRetry;
  }

  public void setDeleteMuteConfigRetry(Retry deleteMuteConfigRetry) {
    this.deleteMuteConfigRetry = deleteMuteConfigRetry;
  }

  public Retry getDeleteNotificationConfigRetry() {
    return this.deleteNotificationConfigRetry;
  }

  public void setDeleteNotificationConfigRetry(Retry deleteNotificationConfigRetry) {
    this.deleteNotificationConfigRetry = deleteNotificationConfigRetry;
  }

  public Retry getDeleteResourceValueConfigRetry() {
    return this.deleteResourceValueConfigRetry;
  }

  public void setDeleteResourceValueConfigRetry(Retry deleteResourceValueConfigRetry) {
    this.deleteResourceValueConfigRetry = deleteResourceValueConfigRetry;
  }

  public Retry getGetBigQueryExportRetry() {
    return this.getBigQueryExportRetry;
  }

  public void setGetBigQueryExportRetry(Retry getBigQueryExportRetry) {
    this.getBigQueryExportRetry = getBigQueryExportRetry;
  }

  public Retry getGetSimulationRetry() {
    return this.getSimulationRetry;
  }

  public void setGetSimulationRetry(Retry getSimulationRetry) {
    this.getSimulationRetry = getSimulationRetry;
  }

  public Retry getGetValuedResourceRetry() {
    return this.getValuedResourceRetry;
  }

  public void setGetValuedResourceRetry(Retry getValuedResourceRetry) {
    this.getValuedResourceRetry = getValuedResourceRetry;
  }

  public Retry getGetIamPolicyRetry() {
    return this.getIamPolicyRetry;
  }

  public void setGetIamPolicyRetry(Retry getIamPolicyRetry) {
    this.getIamPolicyRetry = getIamPolicyRetry;
  }

  public Retry getGetMuteConfigRetry() {
    return this.getMuteConfigRetry;
  }

  public void setGetMuteConfigRetry(Retry getMuteConfigRetry) {
    this.getMuteConfigRetry = getMuteConfigRetry;
  }

  public Retry getGetNotificationConfigRetry() {
    return this.getNotificationConfigRetry;
  }

  public void setGetNotificationConfigRetry(Retry getNotificationConfigRetry) {
    this.getNotificationConfigRetry = getNotificationConfigRetry;
  }

  public Retry getGetResourceValueConfigRetry() {
    return this.getResourceValueConfigRetry;
  }

  public void setGetResourceValueConfigRetry(Retry getResourceValueConfigRetry) {
    this.getResourceValueConfigRetry = getResourceValueConfigRetry;
  }

  public Retry getGetSourceRetry() {
    return this.getSourceRetry;
  }

  public void setGetSourceRetry(Retry getSourceRetry) {
    this.getSourceRetry = getSourceRetry;
  }

  public Retry getGroupFindingsRetry() {
    return this.groupFindingsRetry;
  }

  public void setGroupFindingsRetry(Retry groupFindingsRetry) {
    this.groupFindingsRetry = groupFindingsRetry;
  }

  public Retry getListAttackPathsRetry() {
    return this.listAttackPathsRetry;
  }

  public void setListAttackPathsRetry(Retry listAttackPathsRetry) {
    this.listAttackPathsRetry = listAttackPathsRetry;
  }

  public Retry getListBigQueryExportsRetry() {
    return this.listBigQueryExportsRetry;
  }

  public void setListBigQueryExportsRetry(Retry listBigQueryExportsRetry) {
    this.listBigQueryExportsRetry = listBigQueryExportsRetry;
  }

  public Retry getListFindingsRetry() {
    return this.listFindingsRetry;
  }

  public void setListFindingsRetry(Retry listFindingsRetry) {
    this.listFindingsRetry = listFindingsRetry;
  }

  public Retry getListMuteConfigsRetry() {
    return this.listMuteConfigsRetry;
  }

  public void setListMuteConfigsRetry(Retry listMuteConfigsRetry) {
    this.listMuteConfigsRetry = listMuteConfigsRetry;
  }

  public Retry getListNotificationConfigsRetry() {
    return this.listNotificationConfigsRetry;
  }

  public void setListNotificationConfigsRetry(Retry listNotificationConfigsRetry) {
    this.listNotificationConfigsRetry = listNotificationConfigsRetry;
  }

  public Retry getListResourceValueConfigsRetry() {
    return this.listResourceValueConfigsRetry;
  }

  public void setListResourceValueConfigsRetry(Retry listResourceValueConfigsRetry) {
    this.listResourceValueConfigsRetry = listResourceValueConfigsRetry;
  }

  public Retry getListSourcesRetry() {
    return this.listSourcesRetry;
  }

  public void setListSourcesRetry(Retry listSourcesRetry) {
    this.listSourcesRetry = listSourcesRetry;
  }

  public Retry getListValuedResourcesRetry() {
    return this.listValuedResourcesRetry;
  }

  public void setListValuedResourcesRetry(Retry listValuedResourcesRetry) {
    this.listValuedResourcesRetry = listValuedResourcesRetry;
  }

  public Retry getSetFindingStateRetry() {
    return this.setFindingStateRetry;
  }

  public void setSetFindingStateRetry(Retry setFindingStateRetry) {
    this.setFindingStateRetry = setFindingStateRetry;
  }

  public Retry getSetIamPolicyRetry() {
    return this.setIamPolicyRetry;
  }

  public void setSetIamPolicyRetry(Retry setIamPolicyRetry) {
    this.setIamPolicyRetry = setIamPolicyRetry;
  }

  public Retry getSetMuteRetry() {
    return this.setMuteRetry;
  }

  public void setSetMuteRetry(Retry setMuteRetry) {
    this.setMuteRetry = setMuteRetry;
  }

  public Retry getTestIamPermissionsRetry() {
    return this.testIamPermissionsRetry;
  }

  public void setTestIamPermissionsRetry(Retry testIamPermissionsRetry) {
    this.testIamPermissionsRetry = testIamPermissionsRetry;
  }

  public Retry getUpdateBigQueryExportRetry() {
    return this.updateBigQueryExportRetry;
  }

  public void setUpdateBigQueryExportRetry(Retry updateBigQueryExportRetry) {
    this.updateBigQueryExportRetry = updateBigQueryExportRetry;
  }

  public Retry getUpdateExternalSystemRetry() {
    return this.updateExternalSystemRetry;
  }

  public void setUpdateExternalSystemRetry(Retry updateExternalSystemRetry) {
    this.updateExternalSystemRetry = updateExternalSystemRetry;
  }

  public Retry getUpdateFindingRetry() {
    return this.updateFindingRetry;
  }

  public void setUpdateFindingRetry(Retry updateFindingRetry) {
    this.updateFindingRetry = updateFindingRetry;
  }

  public Retry getUpdateMuteConfigRetry() {
    return this.updateMuteConfigRetry;
  }

  public void setUpdateMuteConfigRetry(Retry updateMuteConfigRetry) {
    this.updateMuteConfigRetry = updateMuteConfigRetry;
  }

  public Retry getUpdateNotificationConfigRetry() {
    return this.updateNotificationConfigRetry;
  }

  public void setUpdateNotificationConfigRetry(Retry updateNotificationConfigRetry) {
    this.updateNotificationConfigRetry = updateNotificationConfigRetry;
  }

  public Retry getUpdateResourceValueConfigRetry() {
    return this.updateResourceValueConfigRetry;
  }

  public void setUpdateResourceValueConfigRetry(Retry updateResourceValueConfigRetry) {
    this.updateResourceValueConfigRetry = updateResourceValueConfigRetry;
  }

  public Retry getUpdateSecurityMarksRetry() {
    return this.updateSecurityMarksRetry;
  }

  public void setUpdateSecurityMarksRetry(Retry updateSecurityMarksRetry) {
    this.updateSecurityMarksRetry = updateSecurityMarksRetry;
  }

  public Retry getUpdateSourceRetry() {
    return this.updateSourceRetry;
  }

  public void setUpdateSourceRetry(Retry updateSourceRetry) {
    this.updateSourceRetry = updateSourceRetry;
  }
}
