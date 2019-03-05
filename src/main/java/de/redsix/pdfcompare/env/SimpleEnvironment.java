package de.redsix.pdfcompare.env;

import static com.google.common.base.Preconditions.checkNotNull;

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
        checkNotNull(fallback, "fallback is null");

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
