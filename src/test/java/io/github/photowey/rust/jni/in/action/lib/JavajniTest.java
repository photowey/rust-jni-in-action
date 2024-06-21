/*
 * Copyright © 2024 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package io.github.photowey.rust.jni.in.action.lib;

import org.junit.jupiter.api.Assertions;

/**
 * {@code JavajniTest}
 *
 * @author photowey
 * @version 1.0.0
 * @since 2024/06/21
 */
class JavajniTest {

    //@Test
    void testItWorks() {
        Assertions.assertEquals(1 << 2, Javajni.add(2, 2));
        Assertions.assertEquals(1 << 11, Javajni.add(1024, 1024));
    }
}