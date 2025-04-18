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

package com.google.cloud.compute.v1.spring;

import com.google.api.core.BetaApi;
import com.google.api.gax.core.CredentialsProvider;
import com.google.api.gax.core.ExecutorProvider;
import com.google.api.gax.retrying.RetrySettings;
import com.google.api.gax.rpc.HeaderProvider;
import com.google.api.gax.rpc.TransportChannelProvider;
import com.google.cloud.compute.v1.RoutersClient;
import com.google.cloud.compute.v1.RoutersSettings;
import com.google.cloud.spring.autoconfigure.core.GcpContextAutoConfiguration;
import com.google.cloud.spring.core.DefaultCredentialsProvider;
import com.google.cloud.spring.core.Retry;
import com.google.cloud.spring.core.util.RetryUtil;
import java.io.IOException;
import java.util.Collections;
import javax.annotation.Generated;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.autoconfigure.AutoConfiguration;
import org.springframework.boot.autoconfigure.AutoConfigureAfter;
import org.springframework.boot.autoconfigure.condition.ConditionalOnClass;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;

// AUTO-GENERATED DOCUMENTATION AND CLASS.
/**
 * Auto-configuration for {@link RoutersClient}.
 *
 * <p>Provides auto-configuration for Spring Boot
 *
 * <p>The default instance has everything set to sensible defaults:
 *
 * <ul>
 *   <li>The default transport provider is used.
 *   <li>Credentials are acquired automatically through Application Default Credentials.
 *   <li>Retries are configured for idempotent methods but not for non-idempotent methods.
 * </ul>
 */
@Generated("by google-cloud-spring-generator")
@BetaApi("Autogenerated Spring autoconfiguration is not yet stable")
@AutoConfiguration
@AutoConfigureAfter(GcpContextAutoConfiguration.class)
@ConditionalOnClass(RoutersClient.class)
@ConditionalOnProperty(value = "com.google.cloud.compute.v1.routers.enabled", matchIfMissing = true)
@EnableConfigurationProperties(RoutersSpringProperties.class)
public class RoutersSpringAutoConfiguration {
  private final RoutersSpringProperties clientProperties;
  private final CredentialsProvider credentialsProvider;
  private static final Log LOGGER = LogFactory.getLog(RoutersSpringAutoConfiguration.class);

  protected RoutersSpringAutoConfiguration(
      RoutersSpringProperties clientProperties, CredentialsProvider credentialsProvider)
      throws IOException {
    this.clientProperties = clientProperties;
    if (this.clientProperties.getCredentials().hasKey()) {
      if (LOGGER.isTraceEnabled()) {
        LOGGER.trace("Using credentials from Routers-specific configuration");
      }
      this.credentialsProvider =
          ((CredentialsProvider) new DefaultCredentialsProvider(this.clientProperties));
    } else {
      this.credentialsProvider = credentialsProvider;
    }
  }

  /**
   * Provides a default transport channel provider bean, corresponding to the client library's
   * default transport channel provider. If the library supports both GRPC and REST transport, and
   * the useRest property is configured, the HTTP/JSON transport provider will be used instead of
   * GRPC.
   *
   * @return a default transport channel provider.
   */
  @Bean
  @ConditionalOnMissingBean(name = "defaultRoutersTransportChannelProvider")
  public TransportChannelProvider defaultRoutersTransportChannelProvider() {
    return RoutersSettings.defaultTransportChannelProvider();
  }

  /**
   * Provides a RoutersSettings bean configured to use a DefaultCredentialsProvider and the client
   * library's default transport channel provider (defaultRoutersTransportChannelProvider()). It
   * also configures the quota project ID and executor thread count, if provided through properties.
   *
   * <p>Retry settings are also configured from service-level and method-level properties specified
   * in RoutersSpringProperties. Method-level properties will take precedence over service-level
   * properties if available, and client library defaults will be used if neither are specified.
   *
   * @param defaultTransportChannelProvider TransportChannelProvider to use in the settings.
   * @return a {@link RoutersSettings} bean configured with {@link TransportChannelProvider} bean.
   */
  @Bean
  @ConditionalOnMissingBean
  public RoutersSettings routersSettings(
      @Qualifier("defaultRoutersTransportChannelProvider")
          TransportChannelProvider defaultTransportChannelProvider)
      throws IOException {
    RoutersSettings.Builder clientSettingsBuilder = RoutersSettings.newBuilder();
    clientSettingsBuilder
        .setCredentialsProvider(this.credentialsProvider)
        .setTransportChannelProvider(defaultTransportChannelProvider)
        .setEndpoint(RoutersSettings.getDefaultEndpoint())
        .setHeaderProvider(this.userAgentHeaderProvider());
    if (this.clientProperties.getQuotaProjectId() != null) {
      clientSettingsBuilder.setQuotaProjectId(this.clientProperties.getQuotaProjectId());
      if (LOGGER.isTraceEnabled()) {
        LOGGER.trace(
            "Quota project id set to "
                + this.clientProperties.getQuotaProjectId()
                + ", this overrides project id from credentials.");
      }
    }
    if (this.clientProperties.getExecutorThreadCount() != null) {
      ExecutorProvider executorProvider =
          RoutersSettings.defaultExecutorProviderBuilder()
              .setExecutorThreadCount(this.clientProperties.getExecutorThreadCount())
              .build();
      clientSettingsBuilder.setBackgroundExecutorProvider(executorProvider);
      if (LOGGER.isTraceEnabled()) {
        LOGGER.trace(
            "Background executor thread count is "
                + this.clientProperties.getExecutorThreadCount());
      }
    }
    Retry serviceRetry = clientProperties.getRetry();
    if (serviceRetry != null) {
      RetrySettings aggregatedListRetrySettings =
          RetryUtil.updateRetrySettings(
              clientSettingsBuilder.aggregatedListSettings().getRetrySettings(), serviceRetry);
      clientSettingsBuilder.aggregatedListSettings().setRetrySettings(aggregatedListRetrySettings);

      RetrySettings getRetrySettings =
          RetryUtil.updateRetrySettings(
              clientSettingsBuilder.getSettings().getRetrySettings(), serviceRetry);
      clientSettingsBuilder.getSettings().setRetrySettings(getRetrySettings);

      RetrySettings getNatIpInfoRetrySettings =
          RetryUtil.updateRetrySettings(
              clientSettingsBuilder.getNatIpInfoSettings().getRetrySettings(), serviceRetry);
      clientSettingsBuilder.getNatIpInfoSettings().setRetrySettings(getNatIpInfoRetrySettings);

      RetrySettings getNatMappingInfoRetrySettings =
          RetryUtil.updateRetrySettings(
              clientSettingsBuilder.getNatMappingInfoSettings().getRetrySettings(), serviceRetry);
      clientSettingsBuilder
          .getNatMappingInfoSettings()
          .setRetrySettings(getNatMappingInfoRetrySettings);

      RetrySettings getRoutePolicyRetrySettings =
          RetryUtil.updateRetrySettings(
              clientSettingsBuilder.getRoutePolicySettings().getRetrySettings(), serviceRetry);
      clientSettingsBuilder.getRoutePolicySettings().setRetrySettings(getRoutePolicyRetrySettings);

      RetrySettings getRouterStatusRetrySettings =
          RetryUtil.updateRetrySettings(
              clientSettingsBuilder.getRouterStatusSettings().getRetrySettings(), serviceRetry);
      clientSettingsBuilder
          .getRouterStatusSettings()
          .setRetrySettings(getRouterStatusRetrySettings);

      RetrySettings listRetrySettings =
          RetryUtil.updateRetrySettings(
              clientSettingsBuilder.listSettings().getRetrySettings(), serviceRetry);
      clientSettingsBuilder.listSettings().setRetrySettings(listRetrySettings);

      RetrySettings listBgpRoutesRetrySettings =
          RetryUtil.updateRetrySettings(
              clientSettingsBuilder.listBgpRoutesSettings().getRetrySettings(), serviceRetry);
      clientSettingsBuilder.listBgpRoutesSettings().setRetrySettings(listBgpRoutesRetrySettings);

      RetrySettings listRoutePoliciesRetrySettings =
          RetryUtil.updateRetrySettings(
              clientSettingsBuilder.listRoutePoliciesSettings().getRetrySettings(), serviceRetry);
      clientSettingsBuilder
          .listRoutePoliciesSettings()
          .setRetrySettings(listRoutePoliciesRetrySettings);

      RetrySettings previewRetrySettings =
          RetryUtil.updateRetrySettings(
              clientSettingsBuilder.previewSettings().getRetrySettings(), serviceRetry);
      clientSettingsBuilder.previewSettings().setRetrySettings(previewRetrySettings);

      if (LOGGER.isTraceEnabled()) {
        LOGGER.trace("Configured service-level retry settings from properties.");
      }
    }
    Retry aggregatedListRetry = clientProperties.getAggregatedListRetry();
    if (aggregatedListRetry != null) {
      RetrySettings aggregatedListRetrySettings =
          RetryUtil.updateRetrySettings(
              clientSettingsBuilder.aggregatedListSettings().getRetrySettings(),
              aggregatedListRetry);
      clientSettingsBuilder.aggregatedListSettings().setRetrySettings(aggregatedListRetrySettings);
      if (LOGGER.isTraceEnabled()) {
        LOGGER.trace("Configured method-level retry settings for aggregatedList from properties.");
      }
    }
    Retry getRetry = clientProperties.getGetRetry();
    if (getRetry != null) {
      RetrySettings getRetrySettings =
          RetryUtil.updateRetrySettings(
              clientSettingsBuilder.getSettings().getRetrySettings(), getRetry);
      clientSettingsBuilder.getSettings().setRetrySettings(getRetrySettings);
      if (LOGGER.isTraceEnabled()) {
        LOGGER.trace("Configured method-level retry settings for get from properties.");
      }
    }
    Retry getNatIpInfoRetry = clientProperties.getGetNatIpInfoRetry();
    if (getNatIpInfoRetry != null) {
      RetrySettings getNatIpInfoRetrySettings =
          RetryUtil.updateRetrySettings(
              clientSettingsBuilder.getNatIpInfoSettings().getRetrySettings(), getNatIpInfoRetry);
      clientSettingsBuilder.getNatIpInfoSettings().setRetrySettings(getNatIpInfoRetrySettings);
      if (LOGGER.isTraceEnabled()) {
        LOGGER.trace("Configured method-level retry settings for getNatIpInfo from properties.");
      }
    }
    Retry getNatMappingInfoRetry = clientProperties.getGetNatMappingInfoRetry();
    if (getNatMappingInfoRetry != null) {
      RetrySettings getNatMappingInfoRetrySettings =
          RetryUtil.updateRetrySettings(
              clientSettingsBuilder.getNatMappingInfoSettings().getRetrySettings(),
              getNatMappingInfoRetry);
      clientSettingsBuilder
          .getNatMappingInfoSettings()
          .setRetrySettings(getNatMappingInfoRetrySettings);
      if (LOGGER.isTraceEnabled()) {
        LOGGER.trace(
            "Configured method-level retry settings for getNatMappingInfo from properties.");
      }
    }
    Retry getRoutePolicyRetry = clientProperties.getGetRoutePolicyRetry();
    if (getRoutePolicyRetry != null) {
      RetrySettings getRoutePolicyRetrySettings =
          RetryUtil.updateRetrySettings(
              clientSettingsBuilder.getRoutePolicySettings().getRetrySettings(),
              getRoutePolicyRetry);
      clientSettingsBuilder.getRoutePolicySettings().setRetrySettings(getRoutePolicyRetrySettings);
      if (LOGGER.isTraceEnabled()) {
        LOGGER.trace("Configured method-level retry settings for getRoutePolicy from properties.");
      }
    }
    Retry getRouterStatusRetry = clientProperties.getGetRouterStatusRetry();
    if (getRouterStatusRetry != null) {
      RetrySettings getRouterStatusRetrySettings =
          RetryUtil.updateRetrySettings(
              clientSettingsBuilder.getRouterStatusSettings().getRetrySettings(),
              getRouterStatusRetry);
      clientSettingsBuilder
          .getRouterStatusSettings()
          .setRetrySettings(getRouterStatusRetrySettings);
      if (LOGGER.isTraceEnabled()) {
        LOGGER.trace("Configured method-level retry settings for getRouterStatus from properties.");
      }
    }
    Retry listRetry = clientProperties.getListRetry();
    if (listRetry != null) {
      RetrySettings listRetrySettings =
          RetryUtil.updateRetrySettings(
              clientSettingsBuilder.listSettings().getRetrySettings(), listRetry);
      clientSettingsBuilder.listSettings().setRetrySettings(listRetrySettings);
      if (LOGGER.isTraceEnabled()) {
        LOGGER.trace("Configured method-level retry settings for list from properties.");
      }
    }
    Retry listBgpRoutesRetry = clientProperties.getListBgpRoutesRetry();
    if (listBgpRoutesRetry != null) {
      RetrySettings listBgpRoutesRetrySettings =
          RetryUtil.updateRetrySettings(
              clientSettingsBuilder.listBgpRoutesSettings().getRetrySettings(), listBgpRoutesRetry);
      clientSettingsBuilder.listBgpRoutesSettings().setRetrySettings(listBgpRoutesRetrySettings);
      if (LOGGER.isTraceEnabled()) {
        LOGGER.trace("Configured method-level retry settings for listBgpRoutes from properties.");
      }
    }
    Retry listRoutePoliciesRetry = clientProperties.getListRoutePoliciesRetry();
    if (listRoutePoliciesRetry != null) {
      RetrySettings listRoutePoliciesRetrySettings =
          RetryUtil.updateRetrySettings(
              clientSettingsBuilder.listRoutePoliciesSettings().getRetrySettings(),
              listRoutePoliciesRetry);
      clientSettingsBuilder
          .listRoutePoliciesSettings()
          .setRetrySettings(listRoutePoliciesRetrySettings);
      if (LOGGER.isTraceEnabled()) {
        LOGGER.trace(
            "Configured method-level retry settings for listRoutePolicies from properties.");
      }
    }
    Retry previewRetry = clientProperties.getPreviewRetry();
    if (previewRetry != null) {
      RetrySettings previewRetrySettings =
          RetryUtil.updateRetrySettings(
              clientSettingsBuilder.previewSettings().getRetrySettings(), previewRetry);
      clientSettingsBuilder.previewSettings().setRetrySettings(previewRetrySettings);
      if (LOGGER.isTraceEnabled()) {
        LOGGER.trace("Configured method-level retry settings for preview from properties.");
      }
    }
    return clientSettingsBuilder.build();
  }

  /**
   * Provides a RoutersClient bean configured with RoutersSettings.
   *
   * @param routersSettings settings to configure an instance of client bean.
   * @return a {@link RoutersClient} bean configured with {@link RoutersSettings}
   */
  @Bean
  @ConditionalOnMissingBean
  public RoutersClient routersClient(RoutersSettings routersSettings) throws IOException {
    return RoutersClient.create(routersSettings);
  }

  private HeaderProvider userAgentHeaderProvider() {
    String springLibrary = "spring-autogen-routers";
    String version = this.getClass().getPackage().getImplementationVersion();
    return () -> Collections.singletonMap("user-agent", springLibrary + "/" + version);
  }
}
