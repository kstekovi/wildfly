/*
 * Copyright The WildFly Authors
 * SPDX-License-Identifier: Apache-2.0
 */

package org.wildfly.clustering.ejb.timer;

import java.lang.reflect.Method;
import java.util.stream.Stream;

import org.wildfly.clustering.server.manager.Manager;

/**
 * Manages creation, retrieval, and scheduling of timers.
 * @author Paul Ferraro
 * @param <I> the timer identifier type
 */
public interface TimerManager<I> extends Manager<I> {

    Timer<I> createTimer(I id, IntervalTimerConfiguration config, Object context);

    Timer<I> createTimer(I id, ScheduleTimerConfiguration config, Object context);

    Timer<I> createTimer(I id, ScheduleTimerConfiguration config, Object context, Method method, int index);

    Timer<I> getTimer(I id);

    Stream<I> getActiveTimers();
}
