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

package com.google.cloud.iap.v1.spring;

import com.google.api.core.BetaApi;
import com.google.cloud.spring.core.Credentials;
import com.google.cloud.spring.core.CredentialsSupplier;
import com.google.cloud.spring.core.Retry;
import javax.annotation.Generated;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.context.properties.NestedConfigurationProperty;

// AUTO-GENERATED DOCUMENTATION AND CLASS.
/** Provides default property values for IdentityAwareProxyAdminService client bean */
@Generated("by google-cloud-spring-generator")
@BetaApi("Autogenerated Spring autoconfiguration is not yet stable")
@ConfigurationProperties("com.google.cloud.iap.v1.identity-aware-proxy-admin-service")
public class IdentityAwareProxyAdminServiceSpringProperties implements CredentialsSupplier {
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
   * Allow override of retry settings at method-level for setIamPolicy. If defined, this takes
   * precedence over service-level retry configurations for that RPC method.
   */
  @NestedConfigurationProperty private Retry setIamPolicyRetry;
  /**
   * Allow override of retry settings at method-level for getIamPolicy. If defined, this takes
   * precedence over service-level retry configurations for that RPC method.
   */
  @NestedConfigurationProperty private Retry getIamPolicyRetry;
  /**
   * Allow override of retry settings at method-level for testIamPermissions. If defined, this takes
   * precedence over service-level retry configurations for that RPC method.
   */
  @NestedConfigurationProperty private Retry testIamPermissionsRetry;
  /**
   * Allow override of retry settings at method-level for getIapSettings. If defined, this takes
   * precedence over service-level retry configurations for that RPC method.
   */
  @NestedConfigurationProperty private Retry getIapSettingsRetry;
  /**
   * Allow override of retry settings at method-level for updateIapSettings. If defined, this takes
   * precedence over service-level retry configurations for that RPC method.
   */
  @NestedConfigurationProperty private Retry updateIapSettingsRetry;
  /**
   * Allow override of retry settings at method-level for validateIapAttributeExpression. If
   * defined, this takes precedence over service-level retry configurations for that RPC method.
   */
  @NestedConfigurationProperty private Retry validateIapAttributeExpressionRetry;
  /**
   * Allow override of retry settings at method-level for listTunnelDestGroups. If defined, this
   * takes precedence over service-level retry configurations for that RPC method.
   */
  @NestedConfigurationProperty private Retry listTunnelDestGroupsRetry;
  /**
   * Allow override of retry settings at method-level for createTunnelDestGroup. If defined, this
   * takes precedence over service-level retry configurations for that RPC method.
   */
  @NestedConfigurationProperty private Retry createTunnelDestGroupRetry;
  /**
   * Allow override of retry settings at method-level for getTunnelDestGroup. If defined, this takes
   * precedence over service-level retry configurations for that RPC method.
   */
  @NestedConfigurationProperty private Retry getTunnelDestGroupRetry;
  /**
   * Allow override of retry settings at method-level for deleteTunnelDestGroup. If defined, this
   * takes precedence over service-level retry configurations for that RPC method.
   */
  @NestedConfigurationProperty private Retry deleteTunnelDestGroupRetry;
  /**
   * Allow override of retry settings at method-level for updateTunnelDestGroup. If defined, this
   * takes precedence over service-level retry configurations for that RPC method.
   */
  @NestedConfigurationProperty private Retry updateTunnelDestGroupRetry;

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

  public Retry getSetIamPolicyRetry() {
    return this.setIamPolicyRetry;
  }

  public void setSetIamPolicyRetry(Retry setIamPolicyRetry) {
    this.setIamPolicyRetry = setIamPolicyRetry;
  }

  public Retry getGetIamPolicyRetry() {
    return this.getIamPolicyRetry;
  }

  public void setGetIamPolicyRetry(Retry getIamPolicyRetry) {
    this.getIamPolicyRetry = getIamPolicyRetry;
  }

  public Retry getTestIamPermissionsRetry() {
    return this.testIamPermissionsRetry;
  }

  public void setTestIamPermissionsRetry(Retry testIamPermissionsRetry) {
    this.testIamPermissionsRetry = testIamPermissionsRetry;
  }

  public Retry getGetIapSettingsRetry() {
    return this.getIapSettingsRetry;
  }

  public void setGetIapSettingsRetry(Retry getIapSettingsRetry) {
    this.getIapSettingsRetry = getIapSettingsRetry;
  }

  public Retry getUpdateIapSettingsRetry() {
    return this.updateIapSettingsRetry;
  }

  public void setUpdateIapSettingsRetry(Retry updateIapSettingsRetry) {
    this.updateIapSettingsRetry = updateIapSettingsRetry;
  }

  public Retry getValidateIapAttributeExpressionRetry() {
    return this.validateIapAttributeExpressionRetry;
  }

  public void setValidateIapAttributeExpressionRetry(Retry validateIapAttributeExpressionRetry) {
    this.validateIapAttributeExpressionRetry = validateIapAttributeExpressionRetry;
  }

  public Retry getListTunnelDestGroupsRetry() {
    return this.listTunnelDestGroupsRetry;
  }

  public void setListTunnelDestGroupsRetry(Retry listTunnelDestGroupsRetry) {
    this.listTunnelDestGroupsRetry = listTunnelDestGroupsRetry;
  }

  public Retry getCreateTunnelDestGroupRetry() {
    return this.createTunnelDestGroupRetry;
  }

  public void setCreateTunnelDestGroupRetry(Retry createTunnelDestGroupRetry) {
    this.createTunnelDestGroupRetry = createTunnelDestGroupRetry;
  }

  public Retry getGetTunnelDestGroupRetry() {
    return this.getTunnelDestGroupRetry;
  }

  public void setGetTunnelDestGroupRetry(Retry getTunnelDestGroupRetry) {
    this.getTunnelDestGroupRetry = getTunnelDestGroupRetry;
  }

  public Retry getDeleteTunnelDestGroupRetry() {
    return this.deleteTunnelDestGroupRetry;
  }

  public void setDeleteTunnelDestGroupRetry(Retry deleteTunnelDestGroupRetry) {
    this.deleteTunnelDestGroupRetry = deleteTunnelDestGroupRetry;
  }

  public Retry getUpdateTunnelDestGroupRetry() {
    return this.updateTunnelDestGroupRetry;
  }

  public void setUpdateTunnelDestGroupRetry(Retry updateTunnelDestGroupRetry) {
    this.updateTunnelDestGroupRetry = updateTunnelDestGroupRetry;
  }
}
