package com.tws.refactoring.extract_variable;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

/**
 * Created with IDEA
 *
 * @author:linGuangXiong
 * @Date:2019/7/15
 * @Time:16:39
 * @description:
 */
public class BannerRenderTest {


    BannerRender bannerRender = new BannerRender();


    @Test
    public void should_return_banner_when_call_renderBanner_given_plaform_andriod_and_uc() {

        String ecpertResult = "banner";
        assertEquals(ecpertResult,bannerRender.renderBanner("andriod","uc"));

    }


    @Test
    public void should_return_text_when_call_renderBanner_given_plaform_MAC_and_IE() {

        String ecpertResult = "IE on Mac?";
        assertEquals(ecpertResult,bannerRender.renderBanner("Mac","IE"));

    }


    @Test
    public void should_return_banner_when_call_renderBanner_given_plaform_MAC_and_Safari() {

        String ecpertResult = "banner";
        assertEquals(ecpertResult,bannerRender.renderBanner("Mac","Safari"));

    }




}