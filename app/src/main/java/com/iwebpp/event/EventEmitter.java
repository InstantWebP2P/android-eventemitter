/**
 * Copyright (c) 2014-2015 Tom Zhou,iwebpp@gmail.com
 *
 * @author tomzhou
 */


package com.iwebpp.event;

import java.util.List;

public interface EventEmitter {
    public boolean emit(final String event) throws Exception;

    public boolean emit(final String event, final Object data) throws Exception;

    public interface Listener {
        public void onEvent(final Object data) throws Exception;
    }

    ;

    public EventEmitter on(final String event, final Listener cb) throws Exception;

    public EventEmitter once(final String event, final Listener cb) throws Exception;

    public EventEmitter addListener(final String event, final Listener cb);

    public EventEmitter addListener(final String event, final Listener cb, int priority);

    public EventEmitter removeListener(final String event, final Listener cb);

    public EventEmitter removeListener(final String event);

    public EventEmitter removeListener();

    public EventEmitter removeAllListeners();

    public EventEmitter setMaxListeners(final String event, final int n);

    public List<Listener> listeners(final String event);

    public int listenerCount(final String event);
}
