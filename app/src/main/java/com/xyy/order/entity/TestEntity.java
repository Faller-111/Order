package com.xyy.order.entity;

import java.util.List;

/**
 * 开发者： Hzy
 * 创建时间： 2019/1/5 005 17:28:09.
 * 功能描述：
 * 联系方式： win_hzy@163.com
 */
public class TestEntity {
    public TestEntity(int nearby, int opening, int type, int reorder, PageBean page, PositionBean position, List<Integer> more) {
        this.nearby = nearby;
        this.opening = opening;
        this.type = type;
        this.reorder = reorder;
        this.page = page;
        this.position = position;
        this.more = more;
    }

    @Override
    public String toString() {
        return "{" +
                "nearby=" + nearby +
                ", opening=" + opening +
                ", type=" + type +
                ", reorder=" + reorder +
                ", page=" + page +
                ", position=" + position +
                ", more=" + more +
                '}';
    }

    /**
     * nearby : 5
     * opening : 1
     * type : 9
     * more : [0,1]
     * reorder : 0
     * page : {"pageNumber":1,"pageSize":10}
     * position : {"x":116.308734,"y":40.060905}
     */

    private int nearby;
    private int opening;
    private int type;
    private int reorder;
    private PageBean page;
    private PositionBean position;
    private List<Integer> more;

    public int getNearby() {
        return nearby;
    }

    public void setNearby(int nearby) {
        this.nearby = nearby;
    }

    public int getOpening() {
        return opening;
    }

    public void setOpening(int opening) {
        this.opening = opening;
    }

    public int getType() {
        return type;
    }

    public void setType(int type) {
        this.type = type;
    }

    public int getReorder() {
        return reorder;
    }

    public void setReorder(int reorder) {
        this.reorder = reorder;
    }

    public PageBean getPage() {
        return page;
    }

    public void setPage(PageBean page) {
        this.page = page;
    }

    public PositionBean getPosition() {
        return position;
    }

    public void setPosition(PositionBean position) {
        this.position = position;
    }

    public List<Integer> getMore() {
        return more;
    }

    public void setMore(List<Integer> more) {
        this.more = more;
    }

    public static class PageBean {
        @Override
        public String toString() {
            return "PageBean{" +
                    "pageNumber=" + pageNumber +
                    ", pageSize=" + pageSize +
                    '}';
        }

        public PageBean(int pageNumber, int pageSize) {
            this.pageNumber = pageNumber;
            this.pageSize = pageSize;
        }

        /**
         * pageNumber : 1
         * pageSize : 10
         */

        private int pageNumber;
        private int pageSize;

        public int getPageNumber() {
            return pageNumber;
        }

        public void setPageNumber(int pageNumber) {
            this.pageNumber = pageNumber;
        }

        public int getPageSize() {
            return pageSize;
        }

        public void setPageSize(int pageSize) {
            this.pageSize = pageSize;
        }
    }

    public static class PositionBean {
        public PositionBean(double x, double y) {
            this.x = x;
            this.y = y;
        }

        @Override
        public String toString() {
            return "PositionBean{" +
                    "x=" + x +
                    ", y=" + y +
                    '}';
        }

        /**
         * x : 116.308734
         * y : 40.060905
         */

        private double x;
        private double y;

        public double getX() {
            return x;
        }

        public void setX(double x) {
            this.x = x;
        }

        public double getY() {
            return y;
        }

        public void setY(double y) {
            this.y = y;
        }
    }
}
