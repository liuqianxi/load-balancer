/*
 * JBoss, Home of Professional Open Source
 * Copyright 2011, Red Hat, Inc. and individual contributors
 * by the @authors tag. See the copyright.txt in the distribution for a
 * full listing of individual contributors.
 *
 * This is free software; you can redistribute it and/or modify it
 * under the terms of the GNU Lesser General Public License as
 * published by the Free Software Foundation; either version 2.1 of
 * the License, or (at your option) any later version.
 *
 * This software is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the GNU
 * Lesser General Public License for more details.
 *
 * You should have received a copy of the GNU Lesser General Public
 * License along with this software; if not, write to the Free
 * Software Foundation, Inc., 51 Franklin St, Fifth Floor, Boston, MA
 * 02110-1301 USA, or see the FSF site: http://www.fsf.org.
 */

package org.mobicents.tools.http.balancer;

import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executor;
import org.apache.log4j.Logger;

import org.jboss.netty.bootstrap.ClientBootstrap;
import org.jboss.netty.bootstrap.ServerBootstrap;
import org.jboss.netty.channel.Channel;
import org.mobicents.tools.http.urlrewriting.BalancerUrlRewriteFilter;

public class HttpChannelAssociations {
	static Executor executor;
    static ServerBootstrap serverBootstrap;
    static ServerBootstrap serverSecureBootstrap;
    public static ServerBootstrap serverApiBootstrap;
    static ClientBootstrap inboundBootstrap;
    static ClientBootstrap inboundSecureBootstrap;
    static ConcurrentHashMap<AdvancedChannel, AdvancedChannel> channels;
    public static Channel serverApiChannel;
    static BalancerUrlRewriteFilter urlRewriteFilter;

}
