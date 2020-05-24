package cn.myperf4j.base.metric.processor.log;

import cn.myperf4j.base.config.ProfilingConfig;
import cn.myperf4j.base.log.ILogger;
import cn.myperf4j.base.log.LoggerFactory;
import cn.myperf4j.base.metric.processor.JvmMemoryMetricsProcessor;

/**
 * Created by LinShunkang on 2018/8/25
 */
public abstract class AbstractLogJvmMemoryMetricsProcessor implements JvmMemoryMetricsProcessor {

    protected ILogger logger = LoggerFactory.getLogger(ProfilingConfig.getInstance().getMemoryMetricsFile());

    @Override
    public void beforeProcess(long processId, long startMillis, long stopMillis) {
        //empty
    }

    @Override
    public void afterProcess(long processId, long startMillis, long stopMillis) {
        logger.flushLog();
    }
}