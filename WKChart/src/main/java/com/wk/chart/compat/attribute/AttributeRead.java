
package com.wk.chart.compat.attribute;

import android.content.res.TypedArray;
import android.graphics.Paint;
import android.text.TextUtils;

import com.wk.chart.R;
import com.wk.chart.enumeration.AxisLabelLocation;
import com.wk.chart.enumeration.AxisMarkerAlign;
import com.wk.chart.enumeration.GridMarkerAlign;

/**
 * <p>AttributeRead</p>
 */

public class AttributeRead {

    /**
     * 初始化 BaseAttribute
     */
    public void initAttribute(TypedArray a, BaseAttribute attribute) {
        /**
         * 各个视图模块的配置信息有关属性
         */
        attribute.candleViewHeight = a.getDimension(R.styleable.ChartAttr_candleViewHeight,
                attribute.candleViewHeight);// K线模块高度

        attribute.volumeViewHeight = a.getDimension(R.styleable.ChartAttr_volumeViewHeight,
                attribute.volumeViewHeight);// 交易量模块高度

        attribute.otherViewHeight = a.getDimension(R.styleable.ChartAttr_otherViewHeight,
                attribute.otherViewHeight);// 副图模块高度

        attribute.timeLineViewHeight = a.getDimension(R.styleable.ChartAttr_timeLineViewHeight,
                attribute.timeLineViewHeight);// 分时图模块高度

        attribute.depthViewHeight = a.getDimension(R.styleable.ChartAttr_depthViewHeight,
                attribute.depthViewHeight);// 深度图模块高度

        attribute.viewInterval = a.getDimension(R.styleable.ChartAttr_viewInterval,
                attribute.viewInterval);// 各个视图模块间的间隔

        attribute.borderWidth = a.getDimension(R.styleable.ChartAttr_borderWidth,
                attribute.borderWidth);//边框线条宽度

        attribute.borderColor = a.getColor(R.styleable.ChartAttr_borderColor,
                attribute.borderColor);//边框线条颜色

        attribute.leftScrollOffset = a.getDimension(R.styleable.ChartAttr_leftScrollOffset,
                attribute.leftScrollOffset);//X 轴方向的最小滚动值固定偏移量（左边）

        attribute.rightScrollOffset = a.getDimension(R.styleable.ChartAttr_rightScrollOffset,
                attribute.rightScrollOffset);//X 轴方向的最大滚动值固定偏移量（右边）

        /**
         * 共用的有关属性
         */
        attribute.lineWidth = a.getDimension(R.styleable.ChartAttr_lineWidth,
                attribute.lineWidth);//线条宽度

        attribute.lineColor = a.getColor(R.styleable.ChartAttr_lineColor,
                attribute.lineColor);//线条颜色

        attribute.labelSize = a.getDimension(R.styleable.ChartAttr_labelSize,
                attribute.labelSize);//标签字符大小

        attribute.labelColor = a.getColor(R.styleable.ChartAttr_labelColor,
                attribute.labelColor);//标签字符颜色

        /**
         * 与 grid 标尺刻度有关属性
         */
        attribute.gridCount = a.getInteger(R.styleable.ChartAttr_gridCount,
                attribute.gridCount);//grid数量

        attribute.gridDividingLineWidth = a.getDimension(R.styleable.ChartAttr_gridDividingLineWidth,
                attribute.gridDividingLineWidth);//grid 分割线宽度

        attribute.gridLabelMarginTop = a.getDimension(R.styleable.ChartAttr_gridLabelMarginTop,
                attribute.gridLabelMarginTop);//grid标签上边距

        attribute.gridLabelMarginBottom = a.getDimension(R.styleable.ChartAttr_gridLabelMarginBottom,
                attribute.gridLabelMarginBottom);//grid标签下边距

        attribute.gridLineState = a.getBoolean(R.styleable.ChartAttr_gridLineState,
                attribute.gridLineState);//grid线条是否显示

        /**
         * 与 axis 标尺刻度有关属性
         */
        attribute.axisCount = a.getInteger(R.styleable.ChartAttr_axisCount,
                attribute.axisCount);//axis数量

        attribute.axisLabelLRMargin = a.getDimension(R.styleable.ChartAttr_axisLabelLRMargin,
                attribute.axisLabelLRMargin);//axis标签左右Margin

        attribute.axisLabelTBMargin = a.getDimension(R.styleable.ChartAttr_axisLabelTBMargin,
                attribute.axisLabelTBMargin);//axis标签上下Margin

        int align =
                a.getInteger(R.styleable.ChartAttr_axisLabelLocation, attribute.axisLabelLocation.ordinal());
        attribute.axisLabelLocation = AxisLabelLocation.values()[align];//axis标签显示位置

        attribute.axisLineState = a.getBoolean(R.styleable.ChartAttr_axisLineState,
                attribute.axisLineState);//axis线条是否显示

        /**
         * 与高亮线有关的属性
         */
        attribute.xHighlightAutoWidth = a.getBoolean(R.styleable.ChartAttr_xHighlightAutoWidth,
                attribute.xHighlightAutoWidth);// X高亮线条是否启用自动宽度管理(启用后xHighlightWidth将失效，宽度将实时跟随candleWidth)

        attribute.xHighlightColor = a.getColor(R.styleable.ChartAttr_xHighlightColor,
                attribute.xHighlightColor);// X高亮线条颜色

        attribute.xHighlightIsHide = a.getBoolean(R.styleable.ChartAttr_xHighlightIsHide,
                attribute.xHighlightIsHide);// X高亮线条是否显示

        attribute.yHighlightAutoWidth = a.getBoolean(R.styleable.ChartAttr_yHighlightAutoWidth,
                attribute.yHighlightAutoWidth);// Y高亮线条是否启用自动宽度管理(启用后yHighlightWidth将失效，宽度将实时跟随candleWidth)

        attribute.yHighlightColor = a.getColor(R.styleable.ChartAttr_yHighlightColor,
                attribute.yHighlightColor);// Y高亮线条颜色

        attribute.yHighlightIsHide = a.getBoolean(R.styleable.ChartAttr_yHighlightIsHide,
                attribute.yHighlightIsHide);// Y高亮线条是否显示

        /**
         * 与MarkerView 有关的属性
         */
        attribute.markerBorderWidth = a.getDimension(R.styleable.ChartAttr_markerBorderWidth,
                attribute.markerBorderWidth); // MarkerView 边框宽度

        attribute.markerBorderRadius = a.getDimension(R.styleable.ChartAttr_markerBorderRadius,
                attribute.markerBorderRadius);// MarkerView 边框圆角

        attribute.markerBorderTBPadding = a.getDimension(R.styleable.ChartAttr_markerBorderTBPadding,
                attribute.markerBorderTBPadding);// MarkerView 上下padding

        attribute.markerBorderLRPadding = a.getDimension(R.styleable.ChartAttr_markerBorderLRPadding,
                attribute.markerBorderLRPadding);// MarkerView 左右padding

        attribute.markerBorderColor = a.getColor(R.styleable.ChartAttr_markerBorderColor,
                attribute.markerBorderColor);// MarkerView 边框颜色

        attribute.markerTextSize = a.getDimension(R.styleable.ChartAttr_markerTextSize,
                attribute.markerTextSize); // MarkerView 字符大小

        attribute.markerTextColor = a.getColor(R.styleable.ChartAttr_markerTextColor,
                attribute.markerTextColor);// MarkerView 字符颜色

        align =
                a.getInteger(R.styleable.ChartAttr_gridMarkerAlign, attribute.gridMarkerAlign.ordinal());
        attribute.gridMarkerAlign = GridMarkerAlign.values()[align];// X 轴 MarkerView 对齐方向

        align =
                a.getInteger(R.styleable.ChartAttr_axisMarkerAlign, attribute.axisMarkerAlign.ordinal());
        attribute.axisMarkerAlign = AxisMarkerAlign.values()[align];// Y 轴 MarkerView 对齐方向

        int style = a.getInteger(R.styleable.ChartAttr_markerStyle, attribute.markerStyle.ordinal());
        attribute.markerStyle = Paint.Style.values()[style];//  MarkerView 的style（边框/边框和填充）

        /**
         * 与选择器有关的属性
         */
        attribute.selectorPadding = a.getDimension(R.styleable.ChartAttr_selectorPadding,
                attribute.selectorPadding);//信息选择框的padding

        attribute.selectorMarginX = a.getDimension(R.styleable.ChartAttr_selectorMarginX,
                attribute.selectorMarginX);//信息选择框的左右margin

        attribute.selectorMarginY = a.getDimension(R.styleable.ChartAttr_selectorMarginY,
                attribute.selectorMarginY);//信息选择框的上下margin

        attribute.selectorIntervalY = a.getDimension(R.styleable.ChartAttr_selectorIntervalY,
                attribute.selectorIntervalY);//信息选择框的item上下间隔

        attribute.selectorIntervalX = a.getDimension(R.styleable.ChartAttr_selectorIntervalX,
                attribute.selectorIntervalX);//信息选择框的item上下间隔

        attribute.selectorIntervalX = a.getDimension(R.styleable.ChartAttr_selectorIntervalX,
                attribute.selectorIntervalX);//信息选择框的item左右间隔

        attribute.selectorRadius = a.getDimension(R.styleable.ChartAttr_selectorRadius,
                attribute.selectorRadius);//信息选择框的item左右间隔

        attribute.selectorBorderWidth = a.getDimension(R.styleable.ChartAttr_selectorBorderWidth,
                attribute.selectorBorderWidth);//选择器边框线宽度

        attribute.selectorBorderColor = a.getColor(R.styleable.ChartAttr_selectorBorderColor,
                attribute.selectorBorderColor);// 选择器边框线颜色

        attribute.selectorBackgroundColor = a.getColor(R.styleable.ChartAttr_selectorBackgroundColor,
                attribute.selectorBackgroundColor);// 选择器背景颜色

        attribute.selectorLabelColor = a.getColor(R.styleable.ChartAttr_selectorLabelColor,
                attribute.selectorLabelColor);// 选择器label颜色

        attribute.selectorValueColor = a.getColor(R.styleable.ChartAttr_selectorValueColor,
                attribute.selectorValueColor);// 选择器value颜色

        attribute.selectorLabelSize = a.getDimension(R.styleable.ChartAttr_selectorLabelSize,
                attribute.selectorLabelSize);//选择器label文字大小

        attribute.selectorValueSize = a.getDimension(R.styleable.ChartAttr_selectorValueSize,
                attribute.selectorValueSize);//选择器value文字大小

        /**
         * 与指标文字有关的属性
         */
        attribute.indicatorsTextSize = a.getDimension(R.styleable.ChartAttr_indicatorsTextSize,
                attribute.indicatorsTextSize); // 指标文字大小

        attribute.indicatorsTextMarginX = a.getDimension(R.styleable.ChartAttr_indicatorsTextMarginX,
                attribute.indicatorsTextMarginX); // 指标文字左右margin

        attribute.indicatorsTextMarginY = a.getDimension(R.styleable.ChartAttr_indicatorsTextMarginY,
                attribute.indicatorsTextMarginY); // 指标文字上下margin

        attribute.indicatorsTextInterval = a.getDimension(R.styleable.ChartAttr_indicatorsTextInterval,
                attribute.indicatorsTextInterval); // 指标文字的间隔

        /**
         * 与游标指示器有关的属性
         */
        attribute.cursorBorderWidth = a.getDimension(R.styleable.ChartAttr_cursorBorderWidth,
                attribute.cursorBorderWidth); // 游标文字容器边框宽度

        attribute.cursorBackgroundColor = a.getColor(R.styleable.ChartAttr_cursorBackgroundColor,
                attribute.cursorBackgroundColor);// 游标文字容器背景颜色

        attribute.cursorRadius = a.getDimension(R.styleable.ChartAttr_cursorRadius,
                attribute.cursorRadius); // 游标文字容器圆角

        attribute.cursorLineColor = a.getColor(R.styleable.ChartAttr_cursorLineColor,
                attribute.cursorLineColor);// 游标线颜色

        attribute.cursorTextColor = a.getColor(R.styleable.ChartAttr_cursorTextColor,
                attribute.cursorTextColor);// 游标值颜色

        attribute.cursorBorderColor = a.getColor(R.styleable.ChartAttr_cursorBorderColor,
                attribute.cursorBorderColor);// 游标值容器边框颜色

        attribute.defaultShowLastItem = a.getBoolean(R.styleable.ChartAttr_defaultShowLastItem,
                attribute.defaultShowLastItem);// 默认显示最后一条数据

        /**
         * 极值有关属性
         */
        attribute.candleExtremumLabelSize =
                a.getDimension(R.styleable.ChartAttr_candleExtremumLabelSize,
                        attribute.candleExtremumLabelSize); // 极值字符大小

        attribute.candleExtremumLableColor = a.getColor(R.styleable.ChartAttr_candleExtremumLableColor,
                attribute.candleExtremumLableColor);// 极值字符颜色

        attribute.extremumLineState = a.getBoolean(R.styleable.ChartAttr_extremumLineState,
                attribute.extremumLineState);// 极值横线是否显示

        //最极值标签Drawable
        attribute.extremumTagDrawable = a.getDrawable(R.styleable.ChartAttr_extremumTagDrawable);

        attribute.extremumTagDrawableWidth = a.getDimension(R.styleable.ChartAttr_extremumTagDrawableWidth,
                attribute.extremumTagDrawableWidth);//极值标签Drawable宽度

        attribute.extremumTagDrawableHeight = a.getDimension(R.styleable.ChartAttr_extremumTagDrawableHeight,
                attribute.extremumTagDrawableHeight);//极值标签Drawable高度

        attribute.extremumTagDrawableMarginX = a.getDimension(R.styleable.ChartAttr_extremumTagDrawableMarginX,
                attribute.extremumTagDrawableMarginX);//极值标签Drawable左右margin

        attribute.extremumTagDrawableLocation = a.getInt(R.styleable.ChartAttr_extremumTagDrawableLocation,
                attribute.extremumTagDrawableLocation);//极值标签的Drawable显示位置

        /**
         * 涨跌有关的属性
         */
        attribute.increasingColor = a.getColor(R.styleable.ChartAttr_increasingColor,
                attribute.increasingColor);// 上涨颜色

        attribute.decreasingColor = a.getColor(R.styleable.ChartAttr_decreasingColor,
                attribute.decreasingColor);// 下跌颜色

        attribute.shaderBeginColorAlpha = getAlpha(a.getFloat(R.styleable.ChartAttr_shaderBeginColorAlpha,
                attribute.shaderBeginColorAlpha));//阴影开始颜色的透明度

        attribute.shaderEndColorAlpha = getAlpha(a.getFloat(R.styleable.ChartAttr_shaderEndColorAlpha,
                attribute.shaderEndColorAlpha));//阴影结束颜色的透明度

        attribute.darkColorAlpha = getAlpha(a.getFloat(R.styleable.ChartAttr_darkColorAlpha,
                attribute.darkColorAlpha));//（暗色）透明度（基于涨跌色配合透明度来实现暗色）
        style =
                a.getInteger(R.styleable.ChartAttr_increasingStyle, attribute.increasingStyle.ordinal());
        attribute.increasingStyle = Paint.Style.values()[style];// 上涨蜡烛图填充样式。默认实心

        style =
                a.getInteger(R.styleable.ChartAttr_decreasingStyle, attribute.decreasingStyle.ordinal());
        attribute.decreasingStyle = Paint.Style.values()[style];// 下跌蜡烛图填充样式，默认空心

        /**
         * 缩放有关的属性
         */
        attribute.pointBorderWidth = a.getDimension(R.styleable.ChartAttr_pointBorderWidth,
                attribute.pointBorderWidth);//数据点矩形边框线宽度

        attribute.pointWidth = a.getDimension(R.styleable.ChartAttr_pointWidth,
                attribute.pointWidth);//数据点初始宽度（缩放都将以此宽度为基准）

        attribute.pointSpace = a.getDimension(R.styleable.ChartAttr_pointSpace,
                attribute.pointSpace);//数据点间隔

        attribute.canScroll = a.getBoolean(R.styleable.ChartAttr_canScroll,
                attribute.canScroll);// 能否滚动

        attribute.maxScale = a.getFloat(R.styleable.ChartAttr_maxScale, attribute.maxScale);// 最多放大倍数

        float minScale =
                1f - a.getFloat(R.styleable.ChartAttr_minScale, attribute.minScale) / 10f;// 最多缩小倍数
        attribute.minScale = minScale > 0 ? minScale : 0.1f;

        attribute.currentScale =
                a.getFloat(R.styleable.ChartAttr_currentScale, attribute.currentScale);// 当前X轴缩放倍数

        /**
         * 与股票指标有关的属性
         */
        attribute.centerLineColor = a.getColor(R.styleable.ChartAttr_centerLineColor,
                attribute.centerLineColor);// 视图中心线颜色

        attribute.line1Color = a.getColor(R.styleable.ChartAttr_line1Color,
                attribute.line1Color);// 线条1颜色

        attribute.line2Color = a.getColor(R.styleable.ChartAttr_line2Color,
                attribute.line2Color);// 线条2颜色

        attribute.line3Color = a.getColor(R.styleable.ChartAttr_line3Color,
                attribute.line3Color);// 线条3颜色

        attribute.line4Color = a.getColor(R.styleable.ChartAttr_line4Color,
                attribute.line4Color);// 线条4颜色

        attribute.line5Color = a.getColor(R.styleable.ChartAttr_line5Color,
                attribute.line5Color);// 线条5颜色

        /**
         * 与水印有关的属性
         */
        attribute.waterMarkingWidth = a.getDimension(R.styleable.ChartAttr_waterMarkingWidth,
                attribute.waterMarkingWidth);//水印宽度

        attribute.waterMarkingHeight = a.getDimension(R.styleable.ChartAttr_waterMarkingHeight,
                attribute.waterMarkingHeight);//水印高度

        attribute.waterMarkingMarginX = a.getDimension(R.styleable.ChartAttr_waterMarkingMarginX,
                attribute.waterMarkingMarginX);//水印左右margin

        attribute.waterMarkingMarginY = a.getDimension(R.styleable.ChartAttr_waterMarkingMarginY,
                attribute.waterMarkingMarginY);//水印上下margin

        //水印Drawable
        attribute.waterMarkingDrawable = a.getDrawable(R.styleable.ChartAttr_waterMarkingDrawable);

        attribute.waterMarkingAlign = a.getInt(R.styleable.ChartAttr_waterMarkingAlign,
                attribute.waterMarkingAlign);//水印对其齐方向

        /**
         * 与呼吸灯有关的属性
         */
        attribute.breathingLampRadius = a.getDimension(R.styleable.ChartAttr_breathingLampRadius,
                attribute.breathingLampRadius);//呼吸灯圆点半径

        attribute.breathingLampColor = a.getColor(R.styleable.ChartAttr_breathingLampColor,
                attribute.breathingLampColor);//呼吸灯颜色

        attribute.breathingLampAutoTwinkleInterval = a.getInt(R.styleable.ChartAttr_breathingLampAutoTwinkleInterval,
                attribute.breathingLampAutoTwinkleInterval);//呼吸灯自动闪烁时间（0为不自动闪烁）


        /**
         * 与标记点有关的属性
         */
        attribute.markerPointMinMargin = a.getDimension(R.styleable.ChartAttr_markerPointMinMargin,
                attribute.markerPointMinMargin);//标记点最小边距

        attribute.markerPointTextMarginY = a.getDimension(R.styleable.ChartAttr_markerPointTextMarginY,
                attribute.markerPointTextMarginY);//标记点文字上下边距

        attribute.markerPointTextMarginX = a.getDimension(R.styleable.ChartAttr_markerPointTextMarginX,
                attribute.markerPointTextMarginX);//标记点文字左右边距

        attribute.markerPointLineWidth = a.getDimension(R.styleable.ChartAttr_markerPointLineWidth,
                attribute.markerPointLineWidth);//标记点连接线宽度

        attribute.markerPointLineDefaultLength = a.getDimension(R.styleable.ChartAttr_markerPointLineDefaultLength,
                attribute.markerPointLineDefaultLength);//标记点连接线默认长度

        attribute.markerPointJointRadius = a.getDimension(R.styleable.ChartAttr_markerPointJointRadius,
                attribute.markerPointJointRadius);//标记点接点半径（小圆点和小三角）

        attribute.markerPointJointMargin = a.getDimension(R.styleable.ChartAttr_markerPointJointMargin,
                attribute.markerPointJointMargin);//标记点接点边距（小圆点距离K线柱的距离）

        attribute.markerPointTextSize = a.getDimension(R.styleable.ChartAttr_markerPointTextSize,
                attribute.markerPointTextSize);//标记点文字大小

        attribute.markerPointTextColor = a.getColor(R.styleable.ChartAttr_markerPointTextColor,
                attribute.markerPointTextColor);//标记点文字颜色

        attribute.markerPointColorB = a.getColor(R.styleable.ChartAttr_markerPointColorB,
                attribute.markerPointColorB);//B标记点颜色

        attribute.markerPointColorS = a.getColor(R.styleable.ChartAttr_markerPointColorS,
                attribute.markerPointColorS);//S标记点颜色

        attribute.markerPointColorT = a.getColor(R.styleable.ChartAttr_markerPointColorT,
                attribute.markerPointColorT);//T标记点颜色


        /**
         *  与loading和error有关的属性
         */
        attribute.loadingTextSize = a.getDimension(R.styleable.ChartAttr_loadingTextSize,
                attribute.loadingTextSize);

        attribute.loadingTextColor = a.getColor(R.styleable.ChartAttr_loadingTextColor,
                attribute.loadingTextColor);

        String loadingText = a.getString(R.styleable.ChartAttr_loadingText);
        if (!TextUtils.isEmpty(loadingText)) {
            attribute.loadingText = loadingText;
        }

        attribute.errorTextSize = a.getDimension(R.styleable.ChartAttr_errorTextSize,
                attribute.errorTextSize);

        attribute.errorTextColor = a.getColor(R.styleable.ChartAttr_errorTextColor,
                attribute.errorTextColor);

        String errorText = a.getString(R.styleable.ChartAttr_errorText);
        if (!TextUtils.isEmpty(errorText)) {
            attribute.errorText = errorText;
        }

        /**
         * 与蜡烛图有关的属性
         */
        if (attribute instanceof CandleAttribute) {
            CandleAttribute candleAttribute = (CandleAttribute) attribute;

            candleAttribute.timeLineWidth = a.getDimension(R.styleable.ChartAttr_timeLineWidth,
                    candleAttribute.timeLineWidth);//分时图线条宽度

            candleAttribute.timeLineColor = a.getColor(R.styleable.ChartAttr_timeLineColor,
                    candleAttribute.timeLineColor);//分时图线条颜色
        }

        /**
         * 与深度图有关的属性
         */
        if (attribute instanceof DepthAttribute) {
            DepthAttribute depthAttribute = (DepthAttribute) attribute;

            depthAttribute.polylineWidth = a.getDimension(R.styleable.ChartAttr_depthLineWidth,
                    depthAttribute.polylineWidth);// 折线宽度

            depthAttribute.circleSize = a.getDimension(R.styleable.ChartAttr_circleSize,
                    depthAttribute.circleSize);// 圆点大小

            depthAttribute.depthGridStyle = a.getInteger(R.styleable.ChartAttr_depthGridStyle,
                    depthAttribute.depthGridStyle);// 深度图grid样式
        }
    }

    /**
     * 获取正确的透明度
     *
     * @param alpha 透明度
     * @return 正确的透明度
     */
    private float getAlpha(float alpha) {
        alpha = Math.max(0.0f, alpha);
        alpha = Math.min(1.0f, alpha);
        return alpha;
    }
}
