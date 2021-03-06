/**
 *     This code was auto-generated by a Codezu.     
 *
 *     Changes to this file may cause incorrect behavior and will be lost if
 *     the code is regenerated.
 */
package com.mozu.api.resources.commerce;

import com.mozu.api.ApiContext;
import java.util.List;
import java.util.ArrayList;
import com.mozu.api.MozuClient;
import com.mozu.api.MozuClientFactory;
import com.mozu.api.MozuUrl;
import com.mozu.api.Headers;
import org.joda.time.DateTime;
import com.mozu.api.AsyncCallback;
import java.util.concurrent.CountDownLatch;
import com.mozu.api.security.AuthTicket;
import org.apache.commons.lang.StringUtils;

/** <summary>
 * Use the Channels resource to manage the channels a company uses to create logical commercial business divisions based on region or types of sales, such as "US Online," "Amazon," or "EMEA Retail." All orders include a channel association that enables the company to perform financial reporting for each defined channel. Because channels are managed at the tenant level, you must associate all the tenant's sites with a channel. Sites that do not have a defined channel association cannot successfully submit orders.
 * </summary>
 */
public class ChannelResource {
	///
	/// <see cref="Mozu.Api.ApiContext"/>
	///
	private ApiContext _apiContext;


	public ChannelResource(ApiContext apiContext) 
	{
		_apiContext = apiContext;
	}

	
	/**
	 * 
	 * <p><pre><code>
	 *	Channel channel = new Channel();
	 *	ChannelCollection channelCollection = channel.getChannels();
	 * </code></pre></p>
	 * @return com.mozu.api.contracts.commerceruntime.channels.ChannelCollection
	 * @see com.mozu.api.contracts.commerceruntime.channels.ChannelCollection
	 */
	public com.mozu.api.contracts.commerceruntime.channels.ChannelCollection getChannels() throws Exception
	{
		return getChannels( null,  null,  null,  null,  null);
	}

	/**
	 * 
	 * <p><pre><code>
	 *	Channel channel = new Channel();
	 *	CountDownLatch latch = channel.getChannels( callback );
	 *	latch.await()	 * </code></pre></p>
	 * @param  callback callback handler for asynchronous operations
	 * @return com.mozu.api.contracts.commerceruntime.channels.ChannelCollection
	 * @see com.mozu.api.contracts.commerceruntime.channels.ChannelCollection
	 */
	public CountDownLatch getChannelsAsync( AsyncCallback<com.mozu.api.contracts.commerceruntime.channels.ChannelCollection> callback) throws Exception
	{
		return getChannelsAsync( null,  null,  null,  null,  null, callback);
	}

	/**
	 * 
	 * <p><pre><code>
	 *	Channel channel = new Channel();
	 *	ChannelCollection channelCollection = channel.getChannels( startIndex,  pageSize,  sortBy,  filter,  responseFields);
	 * </code></pre></p>
	 * @param filter A set of filter expressions representing the search parameters for a query. This parameter is optional. Refer to [Sorting and Filtering](../../../../Developer/api-guides/sorting-filtering.htm) for a list of supported filters.
	 * @param pageSize When creating paged results from a query, this value indicates the zero-based offset in the complete result set where the returned entities begin. For example, with this parameter set to 25, to get the 51st through the 75th items, set startIndex to 50.
	 * @param responseFields Filtering syntax appended to an API call to increase or decrease the amount of data returned inside a JSON object. This parameter should only be used to retrieve data. Attempting to update data using this parameter may cause data loss.
	 * @param sortBy The element to sort the results by and the channel in which the results appear. Either ascending (a-z) or descending (z-a) channel. Optional. Refer to [Sorting and Filtering](../../../../Developer/api-guides/sorting-filtering.htm) for more information.
	 * @param startIndex When creating paged results from a query, this value indicates the zero-based offset in the complete result set where the returned entities begin. For example, with pageSize set to 25, to get the 51st through the 75th items, set this parameter to 50.
	 * @return com.mozu.api.contracts.commerceruntime.channels.ChannelCollection
	 * @see com.mozu.api.contracts.commerceruntime.channels.ChannelCollection
	 */
	public com.mozu.api.contracts.commerceruntime.channels.ChannelCollection getChannels(Integer startIndex, Integer pageSize, String sortBy, String filter, String responseFields) throws Exception
	{
		MozuClient<com.mozu.api.contracts.commerceruntime.channels.ChannelCollection> client = com.mozu.api.clients.commerce.ChannelClient.getChannelsClient( startIndex,  pageSize,  sortBy,  filter,  responseFields);
		client.setContext(_apiContext);
		client.executeRequest();
		return client.getResult();

	}

	/**
	 * 
	 * <p><pre><code>
	 *	Channel channel = new Channel();
	 *	CountDownLatch latch = channel.getChannels( startIndex,  pageSize,  sortBy,  filter,  responseFields, callback );
	 *	latch.await()	 * </code></pre></p>
	 * @param filter A set of filter expressions representing the search parameters for a query. This parameter is optional. Refer to [Sorting and Filtering](../../../../Developer/api-guides/sorting-filtering.htm) for a list of supported filters.
	 * @param pageSize When creating paged results from a query, this value indicates the zero-based offset in the complete result set where the returned entities begin. For example, with this parameter set to 25, to get the 51st through the 75th items, set startIndex to 50.
	 * @param responseFields Filtering syntax appended to an API call to increase or decrease the amount of data returned inside a JSON object. This parameter should only be used to retrieve data. Attempting to update data using this parameter may cause data loss.
	 * @param sortBy The element to sort the results by and the channel in which the results appear. Either ascending (a-z) or descending (z-a) channel. Optional. Refer to [Sorting and Filtering](../../../../Developer/api-guides/sorting-filtering.htm) for more information.
	 * @param startIndex When creating paged results from a query, this value indicates the zero-based offset in the complete result set where the returned entities begin. For example, with pageSize set to 25, to get the 51st through the 75th items, set this parameter to 50.
	 * @param  callback callback handler for asynchronous operations
	 * @return com.mozu.api.contracts.commerceruntime.channels.ChannelCollection
	 * @see com.mozu.api.contracts.commerceruntime.channels.ChannelCollection
	 */
	public CountDownLatch getChannelsAsync(Integer startIndex, Integer pageSize, String sortBy, String filter, String responseFields, AsyncCallback<com.mozu.api.contracts.commerceruntime.channels.ChannelCollection> callback) throws Exception
	{
		MozuClient<com.mozu.api.contracts.commerceruntime.channels.ChannelCollection> client = com.mozu.api.clients.commerce.ChannelClient.getChannelsClient( startIndex,  pageSize,  sortBy,  filter,  responseFields);
		client.setContext(_apiContext);
		return client.executeRequest(callback);

	}

	/**
	 * 
	 * <p><pre><code>
	 *	Channel channel = new Channel();
	 *	Channel channel = channel.getChannel( code);
	 * </code></pre></p>
	 * @param code User-defined code that uniqely identifies the channel group.
	 * @return com.mozu.api.contracts.commerceruntime.channels.Channel
	 * @see com.mozu.api.contracts.commerceruntime.channels.Channel
	 */
	public com.mozu.api.contracts.commerceruntime.channels.Channel getChannel(String code) throws Exception
	{
		return getChannel( code,  null);
	}

	/**
	 * 
	 * <p><pre><code>
	 *	Channel channel = new Channel();
	 *	CountDownLatch latch = channel.getChannel( code, callback );
	 *	latch.await()	 * </code></pre></p>
	 * @param code User-defined code that uniqely identifies the channel group.
	 * @param  callback callback handler for asynchronous operations
	 * @return com.mozu.api.contracts.commerceruntime.channels.Channel
	 * @see com.mozu.api.contracts.commerceruntime.channels.Channel
	 */
	public CountDownLatch getChannelAsync(String code, AsyncCallback<com.mozu.api.contracts.commerceruntime.channels.Channel> callback) throws Exception
	{
		return getChannelAsync( code,  null, callback);
	}

	/**
	 * 
	 * <p><pre><code>
	 *	Channel channel = new Channel();
	 *	Channel channel = channel.getChannel( code,  responseFields);
	 * </code></pre></p>
	 * @param code User-defined code that uniqely identifies the channel group.
	 * @param responseFields Filtering syntax appended to an API call to increase or decrease the amount of data returned inside a JSON object. This parameter should only be used to retrieve data. Attempting to update data using this parameter may cause data loss.
	 * @return com.mozu.api.contracts.commerceruntime.channels.Channel
	 * @see com.mozu.api.contracts.commerceruntime.channels.Channel
	 */
	public com.mozu.api.contracts.commerceruntime.channels.Channel getChannel(String code, String responseFields) throws Exception
	{
		MozuClient<com.mozu.api.contracts.commerceruntime.channels.Channel> client = com.mozu.api.clients.commerce.ChannelClient.getChannelClient( code,  responseFields);
		client.setContext(_apiContext);
		client.executeRequest();
		return client.getResult();

	}

	/**
	 * 
	 * <p><pre><code>
	 *	Channel channel = new Channel();
	 *	CountDownLatch latch = channel.getChannel( code,  responseFields, callback );
	 *	latch.await()	 * </code></pre></p>
	 * @param code User-defined code that uniqely identifies the channel group.
	 * @param responseFields Filtering syntax appended to an API call to increase or decrease the amount of data returned inside a JSON object. This parameter should only be used to retrieve data. Attempting to update data using this parameter may cause data loss.
	 * @param  callback callback handler for asynchronous operations
	 * @return com.mozu.api.contracts.commerceruntime.channels.Channel
	 * @see com.mozu.api.contracts.commerceruntime.channels.Channel
	 */
	public CountDownLatch getChannelAsync(String code, String responseFields, AsyncCallback<com.mozu.api.contracts.commerceruntime.channels.Channel> callback) throws Exception
	{
		MozuClient<com.mozu.api.contracts.commerceruntime.channels.Channel> client = com.mozu.api.clients.commerce.ChannelClient.getChannelClient( code,  responseFields);
		client.setContext(_apiContext);
		return client.executeRequest(callback);

	}

	/**
	 * 
	 * <p><pre><code>
	 *	Channel channel = new Channel();
	 *	Channel channel = channel.createChannel( channel);
	 * </code></pre></p>
	 * @param channel Properties of a channel used to divide a company into logical business divisions, such as "US Retail," "US Online," or "Amazon." All sites and orders are associated with a channel.
	 * @return com.mozu.api.contracts.commerceruntime.channels.Channel
	 * @see com.mozu.api.contracts.commerceruntime.channels.Channel
	 * @see com.mozu.api.contracts.commerceruntime.channels.Channel
	 */
	public com.mozu.api.contracts.commerceruntime.channels.Channel createChannel(com.mozu.api.contracts.commerceruntime.channels.Channel channel) throws Exception
	{
		return createChannel( channel,  null);
	}

	/**
	 * 
	 * <p><pre><code>
	 *	Channel channel = new Channel();
	 *	CountDownLatch latch = channel.createChannel( channel, callback );
	 *	latch.await()	 * </code></pre></p>
	 * @param  callback callback handler for asynchronous operations
	 * @param channel Properties of a channel used to divide a company into logical business divisions, such as "US Retail," "US Online," or "Amazon." All sites and orders are associated with a channel.
	 * @return com.mozu.api.contracts.commerceruntime.channels.Channel
	 * @see com.mozu.api.contracts.commerceruntime.channels.Channel
	 * @see com.mozu.api.contracts.commerceruntime.channels.Channel
	 */
	public CountDownLatch createChannelAsync(com.mozu.api.contracts.commerceruntime.channels.Channel channel, AsyncCallback<com.mozu.api.contracts.commerceruntime.channels.Channel> callback) throws Exception
	{
		return createChannelAsync( channel,  null, callback);
	}

	/**
	 * 
	 * <p><pre><code>
	 *	Channel channel = new Channel();
	 *	Channel channel = channel.createChannel( channel,  responseFields);
	 * </code></pre></p>
	 * @param responseFields Filtering syntax appended to an API call to increase or decrease the amount of data returned inside a JSON object. This parameter should only be used to retrieve data. Attempting to update data using this parameter may cause data loss.
	 * @param channel Properties of a channel used to divide a company into logical business divisions, such as "US Retail," "US Online," or "Amazon." All sites and orders are associated with a channel.
	 * @return com.mozu.api.contracts.commerceruntime.channels.Channel
	 * @see com.mozu.api.contracts.commerceruntime.channels.Channel
	 * @see com.mozu.api.contracts.commerceruntime.channels.Channel
	 */
	public com.mozu.api.contracts.commerceruntime.channels.Channel createChannel(com.mozu.api.contracts.commerceruntime.channels.Channel channel, String responseFields) throws Exception
	{
		MozuClient<com.mozu.api.contracts.commerceruntime.channels.Channel> client = com.mozu.api.clients.commerce.ChannelClient.createChannelClient( channel,  responseFields);
		client.setContext(_apiContext);
		client.executeRequest();
		return client.getResult();

	}

	/**
	 * 
	 * <p><pre><code>
	 *	Channel channel = new Channel();
	 *	CountDownLatch latch = channel.createChannel( channel,  responseFields, callback );
	 *	latch.await()	 * </code></pre></p>
	 * @param responseFields Filtering syntax appended to an API call to increase or decrease the amount of data returned inside a JSON object. This parameter should only be used to retrieve data. Attempting to update data using this parameter may cause data loss.
	 * @param  callback callback handler for asynchronous operations
	 * @param channel Properties of a channel used to divide a company into logical business divisions, such as "US Retail," "US Online," or "Amazon." All sites and orders are associated with a channel.
	 * @return com.mozu.api.contracts.commerceruntime.channels.Channel
	 * @see com.mozu.api.contracts.commerceruntime.channels.Channel
	 * @see com.mozu.api.contracts.commerceruntime.channels.Channel
	 */
	public CountDownLatch createChannelAsync(com.mozu.api.contracts.commerceruntime.channels.Channel channel, String responseFields, AsyncCallback<com.mozu.api.contracts.commerceruntime.channels.Channel> callback) throws Exception
	{
		MozuClient<com.mozu.api.contracts.commerceruntime.channels.Channel> client = com.mozu.api.clients.commerce.ChannelClient.createChannelClient( channel,  responseFields);
		client.setContext(_apiContext);
		return client.executeRequest(callback);

	}

	/**
	 * 
	 * <p><pre><code>
	 *	Channel channel = new Channel();
	 *	Channel channel = channel.updateChannel( channel,  code);
	 * </code></pre></p>
	 * @param code User-defined code that uniqely identifies the channel group.
	 * @param channel Properties of a channel used to divide a company into logical business divisions, such as "US Retail," "US Online," or "Amazon." All sites and orders are associated with a channel.
	 * @return com.mozu.api.contracts.commerceruntime.channels.Channel
	 * @see com.mozu.api.contracts.commerceruntime.channels.Channel
	 * @see com.mozu.api.contracts.commerceruntime.channels.Channel
	 */
	public com.mozu.api.contracts.commerceruntime.channels.Channel updateChannel(com.mozu.api.contracts.commerceruntime.channels.Channel channel, String code) throws Exception
	{
		return updateChannel( channel,  code,  null);
	}

	/**
	 * 
	 * <p><pre><code>
	 *	Channel channel = new Channel();
	 *	CountDownLatch latch = channel.updateChannel( channel,  code, callback );
	 *	latch.await()	 * </code></pre></p>
	 * @param code User-defined code that uniqely identifies the channel group.
	 * @param  callback callback handler for asynchronous operations
	 * @param channel Properties of a channel used to divide a company into logical business divisions, such as "US Retail," "US Online," or "Amazon." All sites and orders are associated with a channel.
	 * @return com.mozu.api.contracts.commerceruntime.channels.Channel
	 * @see com.mozu.api.contracts.commerceruntime.channels.Channel
	 * @see com.mozu.api.contracts.commerceruntime.channels.Channel
	 */
	public CountDownLatch updateChannelAsync(com.mozu.api.contracts.commerceruntime.channels.Channel channel, String code, AsyncCallback<com.mozu.api.contracts.commerceruntime.channels.Channel> callback) throws Exception
	{
		return updateChannelAsync( channel,  code,  null, callback);
	}

	/**
	 * 
	 * <p><pre><code>
	 *	Channel channel = new Channel();
	 *	Channel channel = channel.updateChannel( channel,  code,  responseFields);
	 * </code></pre></p>
	 * @param code User-defined code that uniqely identifies the channel group.
	 * @param responseFields Filtering syntax appended to an API call to increase or decrease the amount of data returned inside a JSON object. This parameter should only be used to retrieve data. Attempting to update data using this parameter may cause data loss.
	 * @param channel Properties of a channel used to divide a company into logical business divisions, such as "US Retail," "US Online," or "Amazon." All sites and orders are associated with a channel.
	 * @return com.mozu.api.contracts.commerceruntime.channels.Channel
	 * @see com.mozu.api.contracts.commerceruntime.channels.Channel
	 * @see com.mozu.api.contracts.commerceruntime.channels.Channel
	 */
	public com.mozu.api.contracts.commerceruntime.channels.Channel updateChannel(com.mozu.api.contracts.commerceruntime.channels.Channel channel, String code, String responseFields) throws Exception
	{
		MozuClient<com.mozu.api.contracts.commerceruntime.channels.Channel> client = com.mozu.api.clients.commerce.ChannelClient.updateChannelClient( channel,  code,  responseFields);
		client.setContext(_apiContext);
		client.executeRequest();
		return client.getResult();

	}

	/**
	 * 
	 * <p><pre><code>
	 *	Channel channel = new Channel();
	 *	CountDownLatch latch = channel.updateChannel( channel,  code,  responseFields, callback );
	 *	latch.await()	 * </code></pre></p>
	 * @param code User-defined code that uniqely identifies the channel group.
	 * @param responseFields Filtering syntax appended to an API call to increase or decrease the amount of data returned inside a JSON object. This parameter should only be used to retrieve data. Attempting to update data using this parameter may cause data loss.
	 * @param  callback callback handler for asynchronous operations
	 * @param channel Properties of a channel used to divide a company into logical business divisions, such as "US Retail," "US Online," or "Amazon." All sites and orders are associated with a channel.
	 * @return com.mozu.api.contracts.commerceruntime.channels.Channel
	 * @see com.mozu.api.contracts.commerceruntime.channels.Channel
	 * @see com.mozu.api.contracts.commerceruntime.channels.Channel
	 */
	public CountDownLatch updateChannelAsync(com.mozu.api.contracts.commerceruntime.channels.Channel channel, String code, String responseFields, AsyncCallback<com.mozu.api.contracts.commerceruntime.channels.Channel> callback) throws Exception
	{
		MozuClient<com.mozu.api.contracts.commerceruntime.channels.Channel> client = com.mozu.api.clients.commerce.ChannelClient.updateChannelClient( channel,  code,  responseFields);
		client.setContext(_apiContext);
		return client.executeRequest(callback);

	}

	/**
	 * 
	 * <p><pre><code>
	 *	Channel channel = new Channel();
	 *	channel.deleteChannel( code);
	 * </code></pre></p>
	 * @param code User-defined code that uniqely identifies the channel group.
	 * @return 
	 */
	public void deleteChannel(String code) throws Exception
	{
		MozuClient client = com.mozu.api.clients.commerce.ChannelClient.deleteChannelClient( code);
		client.setContext(_apiContext);
		client.executeRequest();
		client.cleanupHttpConnection();

	}

}



