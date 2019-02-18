package com.xyy.order.entity;

import java.util.List;

/**
 * 开发者： Hzy
 * 创建时间： 2019/1/4 004 20:04:58.
 * 功能描述：
 * 联系方式： win_hzy@163.com
 */
public class RestaurantsBean {

    /**
     * code : 200
     * data : {"list":[{"avatar":"http://p1.meituan.net/deal/f51ae5c9c83b23f0ade9ae3a285d0664405599.jpg@380w_214h_1e_1c","closingHours":21,"cost":19,"distance":29.80228538366343,"favor":220,"id":108955,"name":"东北烧烤","openingHours":9,"position":[116.8337359733723,39.99884600414918],"score":4,"selectors":[1,0],"types":[9]},{"avatar":"http://p1.meituan.net/deal/f51ae5c9c83b23f0ade9ae3a285d0664405599.jpg@380w_214h_1e_1c","closingHours":21,"cost":28,"distance":37.918737459155174,"favor":244,"id":113105,"name":"东北烧烤","openingHours":9,"position":[116.86261006054491,39.91165957499645],"score":4,"selectors":[0,1],"types":[9]},{"avatar":"http://p1.meituan.net/deal/f51ae5c9c83b23f0ade9ae3a285d0664405599.jpg@380w_214h_1e_1c","closingHours":21,"cost":50,"distance":39.80454334326095,"favor":171,"id":114812,"name":"东北烧烤","openingHours":9,"position":[116.50598768626216,39.794187625890245],"score":4,"selectors":[2,0,1],"types":[9]},{"avatar":"http://p1.meituan.net/deal/f51ae5c9c83b23f0ade9ae3a285d0664405599.jpg@380w_214h_1e_1c","closingHours":21,"cost":25,"distance":42.86426374220221,"favor":384,"id":111251,"name":"东北烧烤","openingHours":9,"position":[116.29025126347409,39.818744142066976],"score":4,"selectors":[1,0],"types":[9]},{"avatar":"http://p1.meituan.net/deal/f51ae5c9c83b23f0ade9ae3a285d0664405599.jpg@380w_214h_1e_1c","closingHours":21,"cost":16,"distance":45.64803562875779,"favor":363,"id":105427,"name":"东北烧烤","openingHours":9,"position":[116.59943572796709,39.742514574837074],"score":4,"selectors":[1,0],"types":[9]},{"avatar":"http://p1.meituan.net/deal/f51ae5c9c83b23f0ade9ae3a285d0664405599.jpg@380w_214h_1e_1c","closingHours":21,"cost":25,"distance":45.807591108580255,"favor":181,"id":107051,"name":"东北烧烤","openingHours":9,"position":[116.45589509142478,39.74474465377146],"score":4,"selectors":[0,1],"types":[9]},{"avatar":"http://p1.meituan.net/deal/f51ae5c9c83b23f0ade9ae3a285d0664405599.jpg@380w_214h_1e_1c","closingHours":21,"cost":42,"distance":46.811552544724655,"favor":290,"id":107807,"name":"东北烧烤","openingHours":9,"position":[116.77107436108224,39.76719008258716],"score":4,"selectors":[0,3,2,1],"types":[9]},{"avatar":"http://p1.meituan.net/deal/f51ae5c9c83b23f0ade9ae3a285d0664405599.jpg@380w_214h_1e_1c","closingHours":21,"cost":25,"distance":47.77731401305841,"favor":373,"id":114002,"name":"东北烧烤","openingHours":9,"position":[116.9997900263917,39.89921886522634],"score":4,"selectors":[1,0],"types":[9]},{"avatar":"http://p1.meituan.net/deal/__26218156__8593562.jpg@380w_214h_1e_1c","closingHours":21,"cost":38,"distance":23.274936482532695,"favor":168,"id":106218,"name":"金真子","openingHours":9,"position":[116.63860558881129,39.95394674434708],"score":3,"selectors":[2,1,0],"types":[9]},{"avatar":"http://p1.meituan.net/deal/__26218156__8593562.jpg@380w_214h_1e_1c","closingHours":21,"cost":18,"distance":28.654251420971804,"favor":223,"id":112050,"name":"金真子","openingHours":9,"position":[116.3658896412575,39.93283130930456],"score":3,"selectors":[3,0,1],"types":[9]}],"pageNumber":1,"pageSize":10,"totalPage":3,"totalRecord":28}
     * msg : Successful
     */

    private int code;
    private DataBean data;
    private String msg;

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public DataBean getData() {
        return data;
    }

    public void setData(DataBean data) {
        this.data = data;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public static class DataBean {
        /**
         * list : [{"avatar":"http://p1.meituan.net/deal/f51ae5c9c83b23f0ade9ae3a285d0664405599.jpg@380w_214h_1e_1c","closingHours":21,"cost":19,"distance":29.80228538366343,"favor":220,"id":108955,"name":"东北烧烤","openingHours":9,"position":[116.8337359733723,39.99884600414918],"score":4,"selectors":[1,0],"types":[9]},{"avatar":"http://p1.meituan.net/deal/f51ae5c9c83b23f0ade9ae3a285d0664405599.jpg@380w_214h_1e_1c","closingHours":21,"cost":28,"distance":37.918737459155174,"favor":244,"id":113105,"name":"东北烧烤","openingHours":9,"position":[116.86261006054491,39.91165957499645],"score":4,"selectors":[0,1],"types":[9]},{"avatar":"http://p1.meituan.net/deal/f51ae5c9c83b23f0ade9ae3a285d0664405599.jpg@380w_214h_1e_1c","closingHours":21,"cost":50,"distance":39.80454334326095,"favor":171,"id":114812,"name":"东北烧烤","openingHours":9,"position":[116.50598768626216,39.794187625890245],"score":4,"selectors":[2,0,1],"types":[9]},{"avatar":"http://p1.meituan.net/deal/f51ae5c9c83b23f0ade9ae3a285d0664405599.jpg@380w_214h_1e_1c","closingHours":21,"cost":25,"distance":42.86426374220221,"favor":384,"id":111251,"name":"东北烧烤","openingHours":9,"position":[116.29025126347409,39.818744142066976],"score":4,"selectors":[1,0],"types":[9]},{"avatar":"http://p1.meituan.net/deal/f51ae5c9c83b23f0ade9ae3a285d0664405599.jpg@380w_214h_1e_1c","closingHours":21,"cost":16,"distance":45.64803562875779,"favor":363,"id":105427,"name":"东北烧烤","openingHours":9,"position":[116.59943572796709,39.742514574837074],"score":4,"selectors":[1,0],"types":[9]},{"avatar":"http://p1.meituan.net/deal/f51ae5c9c83b23f0ade9ae3a285d0664405599.jpg@380w_214h_1e_1c","closingHours":21,"cost":25,"distance":45.807591108580255,"favor":181,"id":107051,"name":"东北烧烤","openingHours":9,"position":[116.45589509142478,39.74474465377146],"score":4,"selectors":[0,1],"types":[9]},{"avatar":"http://p1.meituan.net/deal/f51ae5c9c83b23f0ade9ae3a285d0664405599.jpg@380w_214h_1e_1c","closingHours":21,"cost":42,"distance":46.811552544724655,"favor":290,"id":107807,"name":"东北烧烤","openingHours":9,"position":[116.77107436108224,39.76719008258716],"score":4,"selectors":[0,3,2,1],"types":[9]},{"avatar":"http://p1.meituan.net/deal/f51ae5c9c83b23f0ade9ae3a285d0664405599.jpg@380w_214h_1e_1c","closingHours":21,"cost":25,"distance":47.77731401305841,"favor":373,"id":114002,"name":"东北烧烤","openingHours":9,"position":[116.9997900263917,39.89921886522634],"score":4,"selectors":[1,0],"types":[9]},{"avatar":"http://p1.meituan.net/deal/__26218156__8593562.jpg@380w_214h_1e_1c","closingHours":21,"cost":38,"distance":23.274936482532695,"favor":168,"id":106218,"name":"金真子","openingHours":9,"position":[116.63860558881129,39.95394674434708],"score":3,"selectors":[2,1,0],"types":[9]},{"avatar":"http://p1.meituan.net/deal/__26218156__8593562.jpg@380w_214h_1e_1c","closingHours":21,"cost":18,"distance":28.654251420971804,"favor":223,"id":112050,"name":"金真子","openingHours":9,"position":[116.3658896412575,39.93283130930456],"score":3,"selectors":[3,0,1],"types":[9]}]
         * pageNumber : 1
         * pageSize : 10
         * totalPage : 3
         * totalRecord : 28
         */

        private int pageNumber;
        private int pageSize;
        private int totalPage;
        private int totalRecord;
        private List<ListBean> list;

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

        public int getTotalPage() {
            return totalPage;
        }

        public void setTotalPage(int totalPage) {
            this.totalPage = totalPage;
        }

        public int getTotalRecord() {
            return totalRecord;
        }

        public void setTotalRecord(int totalRecord) {
            this.totalRecord = totalRecord;
        }

        public List<ListBean> getList() {
            return list;
        }

        public void setList(List<ListBean> list) {
            this.list = list;
        }

        public static class ListBean {
            /**
             * avatar : http://p1.meituan.net/deal/f51ae5c9c83b23f0ade9ae3a285d0664405599.jpg@380w_214h_1e_1c
             * closingHours : 21
             * cost : 19
             * distance : 29.80228538366343
             * favor : 220
             * id : 108955
             * name : 东北烧烤
             * openingHours : 9
             * position : [116.8337359733723,39.99884600414918]
             * score : 4.0
             * selectors : [1,0]
             * types : [9]
             */

            private String avatar;
            private int closingHours;
            private int cost;
            private double distance;
            private int favor;
            private int id;
            private String name;
            private int openingHours;
            private double score;
            private List<Double> position;
            private List<Integer> selectors;
            private List<Integer> types;

            public String getAvatar() {
                return avatar;
            }

            public void setAvatar(String avatar) {
                this.avatar = avatar;
            }

            public int getClosingHours() {
                return closingHours;
            }

            public void setClosingHours(int closingHours) {
                this.closingHours = closingHours;
            }

            public int getCost() {
                return cost;
            }

            public void setCost(int cost) {
                this.cost = cost;
            }

            public double getDistance() {
                return distance;
            }

            public void setDistance(double distance) {
                this.distance = distance;
            }

            public int getFavor() {
                return favor;
            }

            public void setFavor(int favor) {
                this.favor = favor;
            }

            public int getId() {
                return id;
            }

            public void setId(int id) {
                this.id = id;
            }

            public String getName() {
                return name;
            }

            public void setName(String name) {
                this.name = name;
            }

            public int getOpeningHours() {
                return openingHours;
            }

            public void setOpeningHours(int openingHours) {
                this.openingHours = openingHours;
            }

            public double getScore() {
                return score;
            }

            public void setScore(double score) {
                this.score = score;
            }

            public List<Double> getPosition() {
                return position;
            }

            public void setPosition(List<Double> position) {
                this.position = position;
            }

            public List<Integer> getSelectors() {
                return selectors;
            }

            public void setSelectors(List<Integer> selectors) {
                this.selectors = selectors;
            }

            public List<Integer> getTypes() {
                return types;
            }

            public void setTypes(List<Integer> types) {
                this.types = types;
            }
        }
    }
}
