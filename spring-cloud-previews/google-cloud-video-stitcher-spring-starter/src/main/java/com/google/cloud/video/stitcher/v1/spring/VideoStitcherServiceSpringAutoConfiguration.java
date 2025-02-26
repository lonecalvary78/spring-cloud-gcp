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

package com.google.cloud.video.stitcher.v1.spring;

import com.google.api.core.BetaApi;
import com.google.api.gax.core.CredentialsProvider;
import com.google.api.gax.core.ExecutorProvider;
import com.google.api.gax.retrying.RetrySettings;
import com.google.api.gax.rpc.HeaderProvider;
import com.google.api.gax.rpc.TransportChannelProvider;
import com.google.cloud.spring.autoconfigure.core.GcpContextAutoConfiguration;
import com.google.cloud.spring.core.DefaultCredentialsProvider;
import com.google.cloud.spring.core.Retry;
import com.google.cloud.spring.core.util.RetryUtil;
import com.google.cloud.video.stitcher.v1.VideoStitcherServiceClient;
import com.google.cloud.video.stitcher.v1.VideoStitcherServiceSettings;
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
 * Auto-configuration for {@link VideoStitcherServiceClient}.
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
@ConditionalOnClass(VideoStitcherServiceClient.class)
@ConditionalOnProperty(
    value = "com.google.cloud.video.stitcher.v1.video-stitcher-service.enabled",
    matchIfMissing = true)
@EnableConfigurationProperties(VideoStitcherServiceSpringProperties.class)
public class VideoStitcherServiceSpringAutoConfiguration {
  private final VideoStitcherServiceSpringProperties clientProperties;
  private final CredentialsProvider credentialsProvider;
  private static final Log LOGGER =
      LogFactory.getLog(VideoStitcherServiceSpringAutoConfiguration.class);

  protected VideoStitcherServiceSpringAutoConfiguration(
      VideoStitcherServiceSpringProperties clientProperties,
      CredentialsProvider credentialsProvider)
      throws IOException {
    this.clientProperties = clientProperties;
    if (this.clientProperties.getCredentials().hasKey()) {
      if (LOGGER.isTraceEnabled()) {
        LOGGER.trace("Using credentials from VideoStitcherService-specific configuration");
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
  @ConditionalOnMissingBean(name = "defaultVideoStitcherServiceTransportChannelProvider")
  public TransportChannelProvider defaultVideoStitcherServiceTransportChannelProvider() {
    return VideoStitcherServiceSettings.defaultTransportChannelProvider();
  }

  /**
   * Provides a VideoStitcherServiceSettings bean configured to use a DefaultCredentialsProvider and
   * the client library's default transport channel provider
   * (defaultVideoStitcherServiceTransportChannelProvider()). It also configures the quota project
   * ID and executor thread count, if provided through properties.
   *
   * <p>Retry settings are also configured from service-level and method-level properties specified
   * in VideoStitcherServiceSpringProperties. Method-level properties will take precedence over
   * service-level properties if available, and client library defaults will be used if neither are
   * specified.
   *
   * @param defaultTransportChannelProvider TransportChannelProvider to use in the settings.
   * @return a {@link VideoStitcherServiceSettings} bean configured with {@link
   *     TransportChannelProvider} bean.
   */
  @Bean
  @ConditionalOnMissingBean
  public VideoStitcherServiceSettings videoStitcherServiceSettings(
      @Qualifier("defaultVideoStitcherServiceTransportChannelProvider")
          TransportChannelProvider defaultTransportChannelProvider)
      throws IOException {
    VideoStitcherServiceSettings.Builder clientSettingsBuilder =
        VideoStitcherServiceSettings.newBuilder();
    clientSettingsBuilder
        .setCredentialsProvider(this.credentialsProvider)
        .setTransportChannelProvider(defaultTransportChannelProvider)
        .setEndpoint(VideoStitcherServiceSettings.getDefaultEndpoint())
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
          VideoStitcherServiceSettings.defaultExecutorProviderBuilder()
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
      RetrySettings listCdnKeysRetrySettings =
          RetryUtil.updateRetrySettings(
              clientSettingsBuilder.listCdnKeysSettings().getRetrySettings(), serviceRetry);
      clientSettingsBuilder.listCdnKeysSettings().setRetrySettings(listCdnKeysRetrySettings);

      RetrySettings getCdnKeyRetrySettings =
          RetryUtil.updateRetrySettings(
              clientSettingsBuilder.getCdnKeySettings().getRetrySettings(), serviceRetry);
      clientSettingsBuilder.getCdnKeySettings().setRetrySettings(getCdnKeyRetrySettings);

      RetrySettings createVodSessionRetrySettings =
          RetryUtil.updateRetrySettings(
              clientSettingsBuilder.createVodSessionSettings().getRetrySettings(), serviceRetry);
      clientSettingsBuilder
          .createVodSessionSettings()
          .setRetrySettings(createVodSessionRetrySettings);

      RetrySettings getVodSessionRetrySettings =
          RetryUtil.updateRetrySettings(
              clientSettingsBuilder.getVodSessionSettings().getRetrySettings(), serviceRetry);
      clientSettingsBuilder.getVodSessionSettings().setRetrySettings(getVodSessionRetrySettings);

      RetrySettings listVodStitchDetailsRetrySettings =
          RetryUtil.updateRetrySettings(
              clientSettingsBuilder.listVodStitchDetailsSettings().getRetrySettings(),
              serviceRetry);
      clientSettingsBuilder
          .listVodStitchDetailsSettings()
          .setRetrySettings(listVodStitchDetailsRetrySettings);

      RetrySettings getVodStitchDetailRetrySettings =
          RetryUtil.updateRetrySettings(
              clientSettingsBuilder.getVodStitchDetailSettings().getRetrySettings(), serviceRetry);
      clientSettingsBuilder
          .getVodStitchDetailSettings()
          .setRetrySettings(getVodStitchDetailRetrySettings);

      RetrySettings listVodAdTagDetailsRetrySettings =
          RetryUtil.updateRetrySettings(
              clientSettingsBuilder.listVodAdTagDetailsSettings().getRetrySettings(), serviceRetry);
      clientSettingsBuilder
          .listVodAdTagDetailsSettings()
          .setRetrySettings(listVodAdTagDetailsRetrySettings);

      RetrySettings getVodAdTagDetailRetrySettings =
          RetryUtil.updateRetrySettings(
              clientSettingsBuilder.getVodAdTagDetailSettings().getRetrySettings(), serviceRetry);
      clientSettingsBuilder
          .getVodAdTagDetailSettings()
          .setRetrySettings(getVodAdTagDetailRetrySettings);

      RetrySettings listLiveAdTagDetailsRetrySettings =
          RetryUtil.updateRetrySettings(
              clientSettingsBuilder.listLiveAdTagDetailsSettings().getRetrySettings(),
              serviceRetry);
      clientSettingsBuilder
          .listLiveAdTagDetailsSettings()
          .setRetrySettings(listLiveAdTagDetailsRetrySettings);

      RetrySettings getLiveAdTagDetailRetrySettings =
          RetryUtil.updateRetrySettings(
              clientSettingsBuilder.getLiveAdTagDetailSettings().getRetrySettings(), serviceRetry);
      clientSettingsBuilder
          .getLiveAdTagDetailSettings()
          .setRetrySettings(getLiveAdTagDetailRetrySettings);

      RetrySettings listSlatesRetrySettings =
          RetryUtil.updateRetrySettings(
              clientSettingsBuilder.listSlatesSettings().getRetrySettings(), serviceRetry);
      clientSettingsBuilder.listSlatesSettings().setRetrySettings(listSlatesRetrySettings);

      RetrySettings getSlateRetrySettings =
          RetryUtil.updateRetrySettings(
              clientSettingsBuilder.getSlateSettings().getRetrySettings(), serviceRetry);
      clientSettingsBuilder.getSlateSettings().setRetrySettings(getSlateRetrySettings);

      RetrySettings createLiveSessionRetrySettings =
          RetryUtil.updateRetrySettings(
              clientSettingsBuilder.createLiveSessionSettings().getRetrySettings(), serviceRetry);
      clientSettingsBuilder
          .createLiveSessionSettings()
          .setRetrySettings(createLiveSessionRetrySettings);

      RetrySettings getLiveSessionRetrySettings =
          RetryUtil.updateRetrySettings(
              clientSettingsBuilder.getLiveSessionSettings().getRetrySettings(), serviceRetry);
      clientSettingsBuilder.getLiveSessionSettings().setRetrySettings(getLiveSessionRetrySettings);

      RetrySettings listLiveConfigsRetrySettings =
          RetryUtil.updateRetrySettings(
              clientSettingsBuilder.listLiveConfigsSettings().getRetrySettings(), serviceRetry);
      clientSettingsBuilder
          .listLiveConfigsSettings()
          .setRetrySettings(listLiveConfigsRetrySettings);

      RetrySettings getLiveConfigRetrySettings =
          RetryUtil.updateRetrySettings(
              clientSettingsBuilder.getLiveConfigSettings().getRetrySettings(), serviceRetry);
      clientSettingsBuilder.getLiveConfigSettings().setRetrySettings(getLiveConfigRetrySettings);

      RetrySettings listVodConfigsRetrySettings =
          RetryUtil.updateRetrySettings(
              clientSettingsBuilder.listVodConfigsSettings().getRetrySettings(), serviceRetry);
      clientSettingsBuilder.listVodConfigsSettings().setRetrySettings(listVodConfigsRetrySettings);

      RetrySettings getVodConfigRetrySettings =
          RetryUtil.updateRetrySettings(
              clientSettingsBuilder.getVodConfigSettings().getRetrySettings(), serviceRetry);
      clientSettingsBuilder.getVodConfigSettings().setRetrySettings(getVodConfigRetrySettings);

      if (LOGGER.isTraceEnabled()) {
        LOGGER.trace("Configured service-level retry settings from properties.");
      }
    }
    Retry listCdnKeysRetry = clientProperties.getListCdnKeysRetry();
    if (listCdnKeysRetry != null) {
      RetrySettings listCdnKeysRetrySettings =
          RetryUtil.updateRetrySettings(
              clientSettingsBuilder.listCdnKeysSettings().getRetrySettings(), listCdnKeysRetry);
      clientSettingsBuilder.listCdnKeysSettings().setRetrySettings(listCdnKeysRetrySettings);
      if (LOGGER.isTraceEnabled()) {
        LOGGER.trace("Configured method-level retry settings for listCdnKeys from properties.");
      }
    }
    Retry getCdnKeyRetry = clientProperties.getGetCdnKeyRetry();
    if (getCdnKeyRetry != null) {
      RetrySettings getCdnKeyRetrySettings =
          RetryUtil.updateRetrySettings(
              clientSettingsBuilder.getCdnKeySettings().getRetrySettings(), getCdnKeyRetry);
      clientSettingsBuilder.getCdnKeySettings().setRetrySettings(getCdnKeyRetrySettings);
      if (LOGGER.isTraceEnabled()) {
        LOGGER.trace("Configured method-level retry settings for getCdnKey from properties.");
      }
    }
    Retry createVodSessionRetry = clientProperties.getCreateVodSessionRetry();
    if (createVodSessionRetry != null) {
      RetrySettings createVodSessionRetrySettings =
          RetryUtil.updateRetrySettings(
              clientSettingsBuilder.createVodSessionSettings().getRetrySettings(),
              createVodSessionRetry);
      clientSettingsBuilder
          .createVodSessionSettings()
          .setRetrySettings(createVodSessionRetrySettings);
      if (LOGGER.isTraceEnabled()) {
        LOGGER.trace(
            "Configured method-level retry settings for createVodSession from properties.");
      }
    }
    Retry getVodSessionRetry = clientProperties.getGetVodSessionRetry();
    if (getVodSessionRetry != null) {
      RetrySettings getVodSessionRetrySettings =
          RetryUtil.updateRetrySettings(
              clientSettingsBuilder.getVodSessionSettings().getRetrySettings(), getVodSessionRetry);
      clientSettingsBuilder.getVodSessionSettings().setRetrySettings(getVodSessionRetrySettings);
      if (LOGGER.isTraceEnabled()) {
        LOGGER.trace("Configured method-level retry settings for getVodSession from properties.");
      }
    }
    Retry listVodStitchDetailsRetry = clientProperties.getListVodStitchDetailsRetry();
    if (listVodStitchDetailsRetry != null) {
      RetrySettings listVodStitchDetailsRetrySettings =
          RetryUtil.updateRetrySettings(
              clientSettingsBuilder.listVodStitchDetailsSettings().getRetrySettings(),
              listVodStitchDetailsRetry);
      clientSettingsBuilder
          .listVodStitchDetailsSettings()
          .setRetrySettings(listVodStitchDetailsRetrySettings);
      if (LOGGER.isTraceEnabled()) {
        LOGGER.trace(
            "Configured method-level retry settings for listVodStitchDetails from properties.");
      }
    }
    Retry getVodStitchDetailRetry = clientProperties.getGetVodStitchDetailRetry();
    if (getVodStitchDetailRetry != null) {
      RetrySettings getVodStitchDetailRetrySettings =
          RetryUtil.updateRetrySettings(
              clientSettingsBuilder.getVodStitchDetailSettings().getRetrySettings(),
              getVodStitchDetailRetry);
      clientSettingsBuilder
          .getVodStitchDetailSettings()
          .setRetrySettings(getVodStitchDetailRetrySettings);
      if (LOGGER.isTraceEnabled()) {
        LOGGER.trace(
            "Configured method-level retry settings for getVodStitchDetail from properties.");
      }
    }
    Retry listVodAdTagDetailsRetry = clientProperties.getListVodAdTagDetailsRetry();
    if (listVodAdTagDetailsRetry != null) {
      RetrySettings listVodAdTagDetailsRetrySettings =
          RetryUtil.updateRetrySettings(
              clientSettingsBuilder.listVodAdTagDetailsSettings().getRetrySettings(),
              listVodAdTagDetailsRetry);
      clientSettingsBuilder
          .listVodAdTagDetailsSettings()
          .setRetrySettings(listVodAdTagDetailsRetrySettings);
      if (LOGGER.isTraceEnabled()) {
        LOGGER.trace(
            "Configured method-level retry settings for listVodAdTagDetails from properties.");
      }
    }
    Retry getVodAdTagDetailRetry = clientProperties.getGetVodAdTagDetailRetry();
    if (getVodAdTagDetailRetry != null) {
      RetrySettings getVodAdTagDetailRetrySettings =
          RetryUtil.updateRetrySettings(
              clientSettingsBuilder.getVodAdTagDetailSettings().getRetrySettings(),
              getVodAdTagDetailRetry);
      clientSettingsBuilder
          .getVodAdTagDetailSettings()
          .setRetrySettings(getVodAdTagDetailRetrySettings);
      if (LOGGER.isTraceEnabled()) {
        LOGGER.trace(
            "Configured method-level retry settings for getVodAdTagDetail from properties.");
      }
    }
    Retry listLiveAdTagDetailsRetry = clientProperties.getListLiveAdTagDetailsRetry();
    if (listLiveAdTagDetailsRetry != null) {
      RetrySettings listLiveAdTagDetailsRetrySettings =
          RetryUtil.updateRetrySettings(
              clientSettingsBuilder.listLiveAdTagDetailsSettings().getRetrySettings(),
              listLiveAdTagDetailsRetry);
      clientSettingsBuilder
          .listLiveAdTagDetailsSettings()
          .setRetrySettings(listLiveAdTagDetailsRetrySettings);
      if (LOGGER.isTraceEnabled()) {
        LOGGER.trace(
            "Configured method-level retry settings for listLiveAdTagDetails from properties.");
      }
    }
    Retry getLiveAdTagDetailRetry = clientProperties.getGetLiveAdTagDetailRetry();
    if (getLiveAdTagDetailRetry != null) {
      RetrySettings getLiveAdTagDetailRetrySettings =
          RetryUtil.updateRetrySettings(
              clientSettingsBuilder.getLiveAdTagDetailSettings().getRetrySettings(),
              getLiveAdTagDetailRetry);
      clientSettingsBuilder
          .getLiveAdTagDetailSettings()
          .setRetrySettings(getLiveAdTagDetailRetrySettings);
      if (LOGGER.isTraceEnabled()) {
        LOGGER.trace(
            "Configured method-level retry settings for getLiveAdTagDetail from properties.");
      }
    }
    Retry listSlatesRetry = clientProperties.getListSlatesRetry();
    if (listSlatesRetry != null) {
      RetrySettings listSlatesRetrySettings =
          RetryUtil.updateRetrySettings(
              clientSettingsBuilder.listSlatesSettings().getRetrySettings(), listSlatesRetry);
      clientSettingsBuilder.listSlatesSettings().setRetrySettings(listSlatesRetrySettings);
      if (LOGGER.isTraceEnabled()) {
        LOGGER.trace("Configured method-level retry settings for listSlates from properties.");
      }
    }
    Retry getSlateRetry = clientProperties.getGetSlateRetry();
    if (getSlateRetry != null) {
      RetrySettings getSlateRetrySettings =
          RetryUtil.updateRetrySettings(
              clientSettingsBuilder.getSlateSettings().getRetrySettings(), getSlateRetry);
      clientSettingsBuilder.getSlateSettings().setRetrySettings(getSlateRetrySettings);
      if (LOGGER.isTraceEnabled()) {
        LOGGER.trace("Configured method-level retry settings for getSlate from properties.");
      }
    }
    Retry createLiveSessionRetry = clientProperties.getCreateLiveSessionRetry();
    if (createLiveSessionRetry != null) {
      RetrySettings createLiveSessionRetrySettings =
          RetryUtil.updateRetrySettings(
              clientSettingsBuilder.createLiveSessionSettings().getRetrySettings(),
              createLiveSessionRetry);
      clientSettingsBuilder
          .createLiveSessionSettings()
          .setRetrySettings(createLiveSessionRetrySettings);
      if (LOGGER.isTraceEnabled()) {
        LOGGER.trace(
            "Configured method-level retry settings for createLiveSession from properties.");
      }
    }
    Retry getLiveSessionRetry = clientProperties.getGetLiveSessionRetry();
    if (getLiveSessionRetry != null) {
      RetrySettings getLiveSessionRetrySettings =
          RetryUtil.updateRetrySettings(
              clientSettingsBuilder.getLiveSessionSettings().getRetrySettings(),
              getLiveSessionRetry);
      clientSettingsBuilder.getLiveSessionSettings().setRetrySettings(getLiveSessionRetrySettings);
      if (LOGGER.isTraceEnabled()) {
        LOGGER.trace("Configured method-level retry settings for getLiveSession from properties.");
      }
    }
    Retry listLiveConfigsRetry = clientProperties.getListLiveConfigsRetry();
    if (listLiveConfigsRetry != null) {
      RetrySettings listLiveConfigsRetrySettings =
          RetryUtil.updateRetrySettings(
              clientSettingsBuilder.listLiveConfigsSettings().getRetrySettings(),
              listLiveConfigsRetry);
      clientSettingsBuilder
          .listLiveConfigsSettings()
          .setRetrySettings(listLiveConfigsRetrySettings);
      if (LOGGER.isTraceEnabled()) {
        LOGGER.trace("Configured method-level retry settings for listLiveConfigs from properties.");
      }
    }
    Retry getLiveConfigRetry = clientProperties.getGetLiveConfigRetry();
    if (getLiveConfigRetry != null) {
      RetrySettings getLiveConfigRetrySettings =
          RetryUtil.updateRetrySettings(
              clientSettingsBuilder.getLiveConfigSettings().getRetrySettings(), getLiveConfigRetry);
      clientSettingsBuilder.getLiveConfigSettings().setRetrySettings(getLiveConfigRetrySettings);
      if (LOGGER.isTraceEnabled()) {
        LOGGER.trace("Configured method-level retry settings for getLiveConfig from properties.");
      }
    }
    Retry listVodConfigsRetry = clientProperties.getListVodConfigsRetry();
    if (listVodConfigsRetry != null) {
      RetrySettings listVodConfigsRetrySettings =
          RetryUtil.updateRetrySettings(
              clientSettingsBuilder.listVodConfigsSettings().getRetrySettings(),
              listVodConfigsRetry);
      clientSettingsBuilder.listVodConfigsSettings().setRetrySettings(listVodConfigsRetrySettings);
      if (LOGGER.isTraceEnabled()) {
        LOGGER.trace("Configured method-level retry settings for listVodConfigs from properties.");
      }
    }
    Retry getVodConfigRetry = clientProperties.getGetVodConfigRetry();
    if (getVodConfigRetry != null) {
      RetrySettings getVodConfigRetrySettings =
          RetryUtil.updateRetrySettings(
              clientSettingsBuilder.getVodConfigSettings().getRetrySettings(), getVodConfigRetry);
      clientSettingsBuilder.getVodConfigSettings().setRetrySettings(getVodConfigRetrySettings);
      if (LOGGER.isTraceEnabled()) {
        LOGGER.trace("Configured method-level retry settings for getVodConfig from properties.");
      }
    }
    return clientSettingsBuilder.build();
  }

  /**
   * Provides a VideoStitcherServiceClient bean configured with VideoStitcherServiceSettings.
   *
   * @param videoStitcherServiceSettings settings to configure an instance of client bean.
   * @return a {@link VideoStitcherServiceClient} bean configured with {@link
   *     VideoStitcherServiceSettings}
   */
  @Bean
  @ConditionalOnMissingBean
  public VideoStitcherServiceClient videoStitcherServiceClient(
      VideoStitcherServiceSettings videoStitcherServiceSettings) throws IOException {
    return VideoStitcherServiceClient.create(videoStitcherServiceSettings);
  }

  private HeaderProvider userAgentHeaderProvider() {
    String springLibrary = "spring-autogen-video-stitcher-service";
    String version = this.getClass().getPackage().getImplementationVersion();
    return () -> Collections.singletonMap("user-agent", springLibrary + "/" + version);
  }
}
