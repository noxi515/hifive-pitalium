/*
 * Copyright (C) 2015-2016 NS Solutions Corporation
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.htmlhifive.pitalium.it.exec.cap;

import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.rules.TestWatcher;
import org.junit.runner.Description;
import org.openqa.selenium.WebDriverException;

import com.htmlhifive.pitalium.core.PtlTestBase;

/**
 * 不正なブラウザの実行のテスト. <br>
 * -Dcom.htmlhifive.pitalium.environmentConfig=com\htmlhifive\test\it\exec\cap\hifiveRunnerConfig_IllegalBrowserTest_1.
 * json<br>
 * を指定すること.
 */
public class IllegalBrowserTest extends PtlTestBase {

	@Rule
	public ExpectedException expectedException = ExpectedException.none();

	@Rule
	public TestWatcher watchman = new TestWatcher() {

		/*
		 * (非 Javadoc)
		 * @see org.junit.rules.TestWatcher#starting(org.junit.runner.Description)
		 */
		@Override
		protected void starting(Description description) {
			expectedException.expect(WebDriverException.class);
		}
	};

	@Test
	public void testWhenRightCapability() {
		Assert.fail("テストが実行されました");
	}
}
