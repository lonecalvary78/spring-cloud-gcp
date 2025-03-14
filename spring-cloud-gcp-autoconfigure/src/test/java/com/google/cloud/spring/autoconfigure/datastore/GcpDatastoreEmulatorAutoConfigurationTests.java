/*
 * Copyright 2017-2019 the original author or authors.
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

package com.google.cloud.spring.autoconfigure.datastore;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatExceptionOfType;

import com.google.cloud.datastore.DatastoreOptions;
import com.google.cloud.datastore.testing.LocalDatastoreHelper;
import java.nio.file.Paths;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.NoSuchBeanDefinitionException;
import org.springframework.boot.autoconfigure.AutoConfigurations;
import org.springframework.boot.test.context.runner.ApplicationContextRunner;

/**
 * Tests for Datastore Emulator auto-config.
 *
 * @since 1.2
 */
class GcpDatastoreEmulatorAutoConfigurationTests {
  @Test
  void testDatastoreOptionsCorrectlySet() {
    new ApplicationContextRunner()
        .withConfiguration(AutoConfigurations.of(GcpDatastoreEmulatorAutoConfiguration.class))
        .withPropertyValues(
            "spring.cloud.gcp.datastore.emulator.port=8182",
            "spring.cloud.gcp.datastore.emulator.enabled=true",
            "spring.cloud.gcp.datastore.emulator.consistency=0.8",
            "spring.cloud.gcp.datastore.emulator.dataDir=/usr/local/datastore",
            "spring.cloud.gcp.datastore.emulator.storeOnDisk=false",
            "spring.cloud.gcp.datastore.emulator.firestoreInDatastoreMode=true")
        .run(
            context -> {
              LocalDatastoreHelper helper = context.getBean(LocalDatastoreHelper.class);
              DatastoreOptions datastoreOptions = helper.getOptions();
              assertThat(datastoreOptions.getHost()).isEqualTo("localhost:8182");
              assertThat(helper.getConsistency()).isEqualTo(0.8D);
              assertThat(helper.getGcdPath()).isEqualTo(Paths.get("/usr/local/datastore"));
              assertThat(helper.isStoreOnDisk()).isFalse();
              assertThat(helper.isFirestoreInDatastoreMode()).isTrue();
            });
  }

  @Test
  void testDisabledAutoEmulator() {
    new ApplicationContextRunner()
        .withConfiguration(AutoConfigurations.of(GcpDatastoreEmulatorAutoConfiguration.class))
        .run(
            context ->
                assertThatExceptionOfType(NoSuchBeanDefinitionException.class)
                    .isThrownBy(() -> context.getBean(LocalDatastoreHelper.class)));
  }
}
