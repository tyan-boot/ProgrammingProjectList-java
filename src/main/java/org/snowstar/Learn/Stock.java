package org.snowstar.Learn;

import org.apache.http.HttpEntity;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.utils.URIBuilder;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.util.EntityUtils;

import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.nio.charset.Charset;
import java.util.ArrayList;

import com.google.gson.Gson;

/**
 * Created by tyan on 17-3-11.
 * tyanboot@outlook.com
 * ProgrammingProjectList
 */

/*
 * 股票
 */
class Stock {

    private class stock {
        int errorNo;
        String errorMsg;
        String latestTimelineStamp;
        double preClose;

        int version;

        int exchangeStatus;

        ArrayList<innerTime> timeLine;

        class innerTime {
            int date;
            int time;
            double price;
            int volume;
            double avgPrice;
            int ccl;
            double netChangeRatio;
            double preClose;
            float amount;
        }
    }

    private int refreshTime;

    public int getRefreshTime() {
        return refreshTime;
    }

    public void setRefreshTime(int refreshTime) {
        this.refreshTime = refreshTime;
    }

    void getStock(String _id) {
        CloseableHttpClient hc = HttpClients.createDefault();
        URIBuilder uriBuilder = new URIBuilder();
        URI uri = null;
        try {
            uriBuilder.setScheme("https")
                    .setHost("gupiao.baidu.com")
                    .setPath("/api/stocks/stocktimeline")
                    .addParameter("os_ver", "1")
                    .addParameter("cuid", "xxx")
                    .addParameter("vv", "100")
                    .addParameter("format", "json")
                    .addParameter("stock_code", _id)
                    .addParameter("from", "pc");
            uri = uriBuilder.build();
        } catch (URISyntaxException e) {
            System.out.print(e.getMessage());
        }


        HttpGet hget = new HttpGet(uri);

        String content = null;
        try {
            CloseableHttpResponse response = hc.execute(hget);
            HttpEntity he = response.getEntity();
            if (he != null) {
                content = EntityUtils.toString(he, Charset.defaultCharset());
            }
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }

        if (content != null) {
            Gson gson = new Gson();
            stock s = gson.fromJson(content, stock.class);

            System.out.println(s.errorMsg);

        }

    }
}
