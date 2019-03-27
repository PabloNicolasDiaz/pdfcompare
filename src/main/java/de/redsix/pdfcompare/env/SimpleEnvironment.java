/*
 * Copyright 2016 Malte Finsterwalder
 * Copyright [2018] Pablo Nicolas Diaz Bilotto [https://github.com/PabloNicolasDiaz/]
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
package de.redsix.pdfcompare.env;

import static org.apache.commons.lang3.Validate.notNull;

import java.io.File;

public class SimpleEnvironment implements Environment {

	private final Environment fallback;

	private File tempDirectory;

	private Integer nrOfImagesToCache;

	private Integer mergeCacheSize;

	private Integer swapCacheSize;

	private Integer documentCacheSize;

	private Integer maxImageSize;

	private Integer overallTimeout;

	private Boolean parallelProcessing;

	private Double allowedDiffInPercent;

	public SimpleEnvironment() {
		this(DefaultEnvironment.create());
	}

	public SimpleEnvironment(Environment fallback) {
		notNull(fallback, "fallback is null");
		this.fallback = fallback;
	}

	@Override
	public File getTempDirectory() {
		if (tempDirectory != null) {
			return tempDirectory;
		}

		return fallback.getTempDirectory();
	}

	public void setTempDirectory(File tempDirectory) {
		this.tempDirectory = tempDirectory;
	}

	@Override
	public int getNrOfImagesToCache() {
		if (nrOfImagesToCache != null) {
			return nrOfImagesToCache;
		}
		return fallback.getNrOfImagesToCache();
	}

	public void setNrOfImagesToCache(int nrOfImagesToCache) {
		this.nrOfImagesToCache = nrOfImagesToCache;
	}

	@Override
	public int getMergeCacheSize() {
		if (mergeCacheSize != null) {
			return mergeCacheSize;
		}
		return fallback.getMergeCacheSize();
	}

	public void setMergeCacheSize(int mergeCacheSize) {
		this.mergeCacheSize = mergeCacheSize;
	}

	@Override
	public int getSwapCacheSize() {
		if (swapCacheSize != null) {
			return swapCacheSize;
		}
		return fallback.getSwapCacheSize();
	}

	public void setSwapCacheSize(int swapCacheSize) {
		this.swapCacheSize = swapCacheSize;
	}

	@Override
	public int getDocumentCacheSize() {
		if (documentCacheSize != null) {
			return documentCacheSize;
		}
		return fallback.getDocumentCacheSize();
	}

	public void setDocumentCacheSize(int documentCacheSize) {
		this.documentCacheSize = documentCacheSize;
	}

	@Override
	public int getMaxImageSize() {
		if (maxImageSize != null) {
			return maxImageSize;
		}
		return fallback.getMaxImageSize();
	}

	public void setMaxImageSize(int maxImageSize) {
		this.maxImageSize = maxImageSize;
	}

	@Override
	public int getOverallTimeout() {
		if (overallTimeout != null) {
			return overallTimeout;
		}
		return fallback.getOverallTimeout();
	}

	public void setOverallTimeout(int overallTimeout) {
		this.overallTimeout = overallTimeout;
	}

	@Override
	public boolean useParallelProcessing() {
		if (parallelProcessing != null) {
			return parallelProcessing;
		}
		return fallback.useParallelProcessing();
	}

	public void setParallelProcessing(boolean parallelProcessing) {
		this.parallelProcessing = parallelProcessing;
	}

	@Override
	public double getAllowedDiffInPercent() {
		if (allowedDiffInPercent != null) {
			return allowedDiffInPercent;
		}
		return fallback.getAllowedDiffInPercent();
	}

	public void setAllowedDiffInPercent(double allowedDiffInPercent) {
		this.allowedDiffInPercent = allowedDiffInPercent;
	}
}
