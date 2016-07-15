package org.lxp.dailylog.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import org.lxp.dailylog.util.Page;

public class AccountBaseExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    protected Page<AccountBase> page;

    public AccountBaseExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    public String getOrderByClause() {
        return orderByClause;
    }

    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    public boolean isDistinct() {
        return distinct;
    }

    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    public void setPage(Page<AccountBase> page) {
        this.page=page;
    }

    public Page<AccountBase> getPage() {
        return page;
    }

    protected abstract static class GeneratedCriteria {
        protected List<Criterion> criteria;

        protected GeneratedCriteria() {
            super();
            criteria = new ArrayList<Criterion>();
        }

        public boolean isValid() {
            return criteria.size() > 0;
        }

        public List<Criterion> getAllCriteria() {
            return criteria;
        }

        public List<Criterion> getCriteria() {
            return criteria;
        }

        protected void addCriterion(String condition) {
            if (condition == null) {
                throw new RuntimeException("Value for condition cannot be null");
            }
            criteria.add(new Criterion(condition));
        }

        protected void addCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value));
        }

        protected void addCriterion(String condition, Object value1, Object value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value1, value2));
        }

        public Criteria andSeqidIsNull() {
            addCriterion("account.seqid is null");
            return (Criteria) this;
        }

        public Criteria andSeqidIsNotNull() {
            addCriterion("account.seqid is not null");
            return (Criteria) this;
        }

        public Criteria andSeqidEqualTo(Long value) {
            addCriterion("account.seqid =", value, "seqid");
            return (Criteria) this;
        }

        public Criteria andSeqidNotEqualTo(Long value) {
            addCriterion("account.seqid <>", value, "seqid");
            return (Criteria) this;
        }

        public Criteria andSeqidGreaterThan(Long value) {
            addCriterion("account.seqid >", value, "seqid");
            return (Criteria) this;
        }

        public Criteria andSeqidGreaterThanOrEqualTo(Long value) {
            addCriterion("account.seqid >=", value, "seqid");
            return (Criteria) this;
        }

        public Criteria andSeqidLessThan(Long value) {
            addCriterion("account.seqid <", value, "seqid");
            return (Criteria) this;
        }

        public Criteria andSeqidLessThanOrEqualTo(Long value) {
            addCriterion("account.seqid <=", value, "seqid");
            return (Criteria) this;
        }

        public Criteria andSeqidIn(List<Long> values) {
            addCriterion("account.seqid in", values, "seqid");
            return (Criteria) this;
        }

        public Criteria andSeqidNotIn(List<Long> values) {
            addCriterion("account.seqid not in", values, "seqid");
            return (Criteria) this;
        }

        public Criteria andSeqidBetween(Long value1, Long value2) {
            addCriterion("account.seqid between", value1, value2, "seqid");
            return (Criteria) this;
        }

        public Criteria andSeqidNotBetween(Long value1, Long value2) {
            addCriterion("account.seqid not between", value1, value2, "seqid");
            return (Criteria) this;
        }

        public Criteria andUsernameIsNull() {
            addCriterion("account.username is null");
            return (Criteria) this;
        }

        public Criteria andUsernameIsNotNull() {
            addCriterion("account.username is not null");
            return (Criteria) this;
        }

        public Criteria andUsernameEqualTo(String value) {
            addCriterion("account.username =", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameNotEqualTo(String value) {
            addCriterion("account.username <>", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameGreaterThan(String value) {
            addCriterion("account.username >", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameGreaterThanOrEqualTo(String value) {
            addCriterion("account.username >=", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameLessThan(String value) {
            addCriterion("account.username <", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameLessThanOrEqualTo(String value) {
            addCriterion("account.username <=", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameLike(String value) {
            addCriterion("account.username like", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameNotLike(String value) {
            addCriterion("account.username not like", value, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameIn(List<String> values) {
            addCriterion("account.username in", values, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameNotIn(List<String> values) {
            addCriterion("account.username not in", values, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameBetween(String value1, String value2) {
            addCriterion("account.username between", value1, value2, "username");
            return (Criteria) this;
        }

        public Criteria andUsernameNotBetween(String value1, String value2) {
            addCriterion("account.username not between", value1, value2, "username");
            return (Criteria) this;
        }

        public Criteria andRemailIsNull() {
            addCriterion("account.remail is null");
            return (Criteria) this;
        }

        public Criteria andRemailIsNotNull() {
            addCriterion("account.remail is not null");
            return (Criteria) this;
        }

        public Criteria andRemailEqualTo(String value) {
            addCriterion("account.remail =", value, "remail");
            return (Criteria) this;
        }

        public Criteria andRemailNotEqualTo(String value) {
            addCriterion("account.remail <>", value, "remail");
            return (Criteria) this;
        }

        public Criteria andRemailGreaterThan(String value) {
            addCriterion("account.remail >", value, "remail");
            return (Criteria) this;
        }

        public Criteria andRemailGreaterThanOrEqualTo(String value) {
            addCriterion("account.remail >=", value, "remail");
            return (Criteria) this;
        }

        public Criteria andRemailLessThan(String value) {
            addCriterion("account.remail <", value, "remail");
            return (Criteria) this;
        }

        public Criteria andRemailLessThanOrEqualTo(String value) {
            addCriterion("account.remail <=", value, "remail");
            return (Criteria) this;
        }

        public Criteria andRemailLike(String value) {
            addCriterion("account.remail like", value, "remail");
            return (Criteria) this;
        }

        public Criteria andRemailNotLike(String value) {
            addCriterion("account.remail not like", value, "remail");
            return (Criteria) this;
        }

        public Criteria andRemailIn(List<String> values) {
            addCriterion("account.remail in", values, "remail");
            return (Criteria) this;
        }

        public Criteria andRemailNotIn(List<String> values) {
            addCriterion("account.remail not in", values, "remail");
            return (Criteria) this;
        }

        public Criteria andRemailBetween(String value1, String value2) {
            addCriterion("account.remail between", value1, value2, "remail");
            return (Criteria) this;
        }

        public Criteria andRemailNotBetween(String value1, String value2) {
            addCriterion("account.remail not between", value1, value2, "remail");
            return (Criteria) this;
        }

        public Criteria andFpemailIsNull() {
            addCriterion("account.fpemail is null");
            return (Criteria) this;
        }

        public Criteria andFpemailIsNotNull() {
            addCriterion("account.fpemail is not null");
            return (Criteria) this;
        }

        public Criteria andFpemailEqualTo(String value) {
            addCriterion("account.fpemail =", value, "fpemail");
            return (Criteria) this;
        }

        public Criteria andFpemailNotEqualTo(String value) {
            addCriterion("account.fpemail <>", value, "fpemail");
            return (Criteria) this;
        }

        public Criteria andFpemailGreaterThan(String value) {
            addCriterion("account.fpemail >", value, "fpemail");
            return (Criteria) this;
        }

        public Criteria andFpemailGreaterThanOrEqualTo(String value) {
            addCriterion("account.fpemail >=", value, "fpemail");
            return (Criteria) this;
        }

        public Criteria andFpemailLessThan(String value) {
            addCriterion("account.fpemail <", value, "fpemail");
            return (Criteria) this;
        }

        public Criteria andFpemailLessThanOrEqualTo(String value) {
            addCriterion("account.fpemail <=", value, "fpemail");
            return (Criteria) this;
        }

        public Criteria andFpemailLike(String value) {
            addCriterion("account.fpemail like", value, "fpemail");
            return (Criteria) this;
        }

        public Criteria andFpemailNotLike(String value) {
            addCriterion("account.fpemail not like", value, "fpemail");
            return (Criteria) this;
        }

        public Criteria andFpemailIn(List<String> values) {
            addCriterion("account.fpemail in", values, "fpemail");
            return (Criteria) this;
        }

        public Criteria andFpemailNotIn(List<String> values) {
            addCriterion("account.fpemail not in", values, "fpemail");
            return (Criteria) this;
        }

        public Criteria andFpemailBetween(String value1, String value2) {
            addCriterion("account.fpemail between", value1, value2, "fpemail");
            return (Criteria) this;
        }

        public Criteria andFpemailNotBetween(String value1, String value2) {
            addCriterion("account.fpemail not between", value1, value2, "fpemail");
            return (Criteria) this;
        }

        public Criteria andPhoneIsNull() {
            addCriterion("account.phone is null");
            return (Criteria) this;
        }

        public Criteria andPhoneIsNotNull() {
            addCriterion("account.phone is not null");
            return (Criteria) this;
        }

        public Criteria andPhoneEqualTo(String value) {
            addCriterion("account.phone =", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneNotEqualTo(String value) {
            addCriterion("account.phone <>", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneGreaterThan(String value) {
            addCriterion("account.phone >", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneGreaterThanOrEqualTo(String value) {
            addCriterion("account.phone >=", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneLessThan(String value) {
            addCriterion("account.phone <", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneLessThanOrEqualTo(String value) {
            addCriterion("account.phone <=", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneLike(String value) {
            addCriterion("account.phone like", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneNotLike(String value) {
            addCriterion("account.phone not like", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneIn(List<String> values) {
            addCriterion("account.phone in", values, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneNotIn(List<String> values) {
            addCriterion("account.phone not in", values, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneBetween(String value1, String value2) {
            addCriterion("account.phone between", value1, value2, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneNotBetween(String value1, String value2) {
            addCriterion("account.phone not between", value1, value2, "phone");
            return (Criteria) this;
        }

        public Criteria andProductnameIsNull() {
            addCriterion("account.productname is null");
            return (Criteria) this;
        }

        public Criteria andProductnameIsNotNull() {
            addCriterion("account.productname is not null");
            return (Criteria) this;
        }

        public Criteria andProductnameEqualTo(String value) {
            addCriterion("account.productname =", value, "productname");
            return (Criteria) this;
        }

        public Criteria andProductnameNotEqualTo(String value) {
            addCriterion("account.productname <>", value, "productname");
            return (Criteria) this;
        }

        public Criteria andProductnameGreaterThan(String value) {
            addCriterion("account.productname >", value, "productname");
            return (Criteria) this;
        }

        public Criteria andProductnameGreaterThanOrEqualTo(String value) {
            addCriterion("account.productname >=", value, "productname");
            return (Criteria) this;
        }

        public Criteria andProductnameLessThan(String value) {
            addCriterion("account.productname <", value, "productname");
            return (Criteria) this;
        }

        public Criteria andProductnameLessThanOrEqualTo(String value) {
            addCriterion("account.productname <=", value, "productname");
            return (Criteria) this;
        }

        public Criteria andProductnameLike(String value) {
            addCriterion("account.productname like", value, "productname");
            return (Criteria) this;
        }

        public Criteria andProductnameNotLike(String value) {
            addCriterion("account.productname not like", value, "productname");
            return (Criteria) this;
        }

        public Criteria andProductnameIn(List<String> values) {
            addCriterion("account.productname in", values, "productname");
            return (Criteria) this;
        }

        public Criteria andProductnameNotIn(List<String> values) {
            addCriterion("account.productname not in", values, "productname");
            return (Criteria) this;
        }

        public Criteria andProductnameBetween(String value1, String value2) {
            addCriterion("account.productname between", value1, value2, "productname");
            return (Criteria) this;
        }

        public Criteria andProductnameNotBetween(String value1, String value2) {
            addCriterion("account.productname not between", value1, value2, "productname");
            return (Criteria) this;
        }

        public Criteria andProducturlIsNull() {
            addCriterion("account.producturl is null");
            return (Criteria) this;
        }

        public Criteria andProducturlIsNotNull() {
            addCriterion("account.producturl is not null");
            return (Criteria) this;
        }

        public Criteria andProducturlEqualTo(String value) {
            addCriterion("account.producturl =", value, "producturl");
            return (Criteria) this;
        }

        public Criteria andProducturlNotEqualTo(String value) {
            addCriterion("account.producturl <>", value, "producturl");
            return (Criteria) this;
        }

        public Criteria andProducturlGreaterThan(String value) {
            addCriterion("account.producturl >", value, "producturl");
            return (Criteria) this;
        }

        public Criteria andProducturlGreaterThanOrEqualTo(String value) {
            addCriterion("account.producturl >=", value, "producturl");
            return (Criteria) this;
        }

        public Criteria andProducturlLessThan(String value) {
            addCriterion("account.producturl <", value, "producturl");
            return (Criteria) this;
        }

        public Criteria andProducturlLessThanOrEqualTo(String value) {
            addCriterion("account.producturl <=", value, "producturl");
            return (Criteria) this;
        }

        public Criteria andProducturlLike(String value) {
            addCriterion("account.producturl like", value, "producturl");
            return (Criteria) this;
        }

        public Criteria andProducturlNotLike(String value) {
            addCriterion("account.producturl not like", value, "producturl");
            return (Criteria) this;
        }

        public Criteria andProducturlIn(List<String> values) {
            addCriterion("account.producturl in", values, "producturl");
            return (Criteria) this;
        }

        public Criteria andProducturlNotIn(List<String> values) {
            addCriterion("account.producturl not in", values, "producturl");
            return (Criteria) this;
        }

        public Criteria andProducturlBetween(String value1, String value2) {
            addCriterion("account.producturl between", value1, value2, "producturl");
            return (Criteria) this;
        }

        public Criteria andProducturlNotBetween(String value1, String value2) {
            addCriterion("account.producturl not between", value1, value2, "producturl");
            return (Criteria) this;
        }

        public Criteria andJoindateIsNull() {
            addCriterion("account.joindate is null");
            return (Criteria) this;
        }

        public Criteria andJoindateIsNotNull() {
            addCriterion("account.joindate is not null");
            return (Criteria) this;
        }

        public Criteria andJoindateEqualTo(Date value) {
            addCriterion("account.joindate =", value, "joindate");
            return (Criteria) this;
        }

        public Criteria andJoindateNotEqualTo(Date value) {
            addCriterion("account.joindate <>", value, "joindate");
            return (Criteria) this;
        }

        public Criteria andJoindateGreaterThan(Date value) {
            addCriterion("account.joindate >", value, "joindate");
            return (Criteria) this;
        }

        public Criteria andJoindateGreaterThanOrEqualTo(Date value) {
            addCriterion("account.joindate >=", value, "joindate");
            return (Criteria) this;
        }

        public Criteria andJoindateLessThan(Date value) {
            addCriterion("account.joindate <", value, "joindate");
            return (Criteria) this;
        }

        public Criteria andJoindateLessThanOrEqualTo(Date value) {
            addCriterion("account.joindate <=", value, "joindate");
            return (Criteria) this;
        }

        public Criteria andJoindateIn(List<Date> values) {
            addCriterion("account.joindate in", values, "joindate");
            return (Criteria) this;
        }

        public Criteria andJoindateNotIn(List<Date> values) {
            addCriterion("account.joindate not in", values, "joindate");
            return (Criteria) this;
        }

        public Criteria andJoindateBetween(Date value1, Date value2) {
            addCriterion("account.joindate between", value1, value2, "joindate");
            return (Criteria) this;
        }

        public Criteria andJoindateNotBetween(Date value1, Date value2) {
            addCriterion("account.joindate not between", value1, value2, "joindate");
            return (Criteria) this;
        }

        public Criteria andCreatetimeIsNull() {
            addCriterion("account.createtime is null");
            return (Criteria) this;
        }

        public Criteria andCreatetimeIsNotNull() {
            addCriterion("account.createtime is not null");
            return (Criteria) this;
        }

        public Criteria andCreatetimeEqualTo(Date value) {
            addCriterion("account.createtime =", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeNotEqualTo(Date value) {
            addCriterion("account.createtime <>", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeGreaterThan(Date value) {
            addCriterion("account.createtime >", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeGreaterThanOrEqualTo(Date value) {
            addCriterion("account.createtime >=", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeLessThan(Date value) {
            addCriterion("account.createtime <", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeLessThanOrEqualTo(Date value) {
            addCriterion("account.createtime <=", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeIn(List<Date> values) {
            addCriterion("account.createtime in", values, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeNotIn(List<Date> values) {
            addCriterion("account.createtime not in", values, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeBetween(Date value1, Date value2) {
            addCriterion("account.createtime between", value1, value2, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeNotBetween(Date value1, Date value2) {
            addCriterion("account.createtime not between", value1, value2, "createtime");
            return (Criteria) this;
        }
    }

    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    public static class Criterion {
        private String condition;

        private Object value;

        private Object secondValue;

        private boolean noValue;

        private boolean singleValue;

        private boolean betweenValue;

        private boolean listValue;

        private String typeHandler;

        public String getCondition() {
            return condition;
        }

        public Object getValue() {
            return value;
        }

        public Object getSecondValue() {
            return secondValue;
        }

        public boolean isNoValue() {
            return noValue;
        }

        public boolean isSingleValue() {
            return singleValue;
        }

        public boolean isBetweenValue() {
            return betweenValue;
        }

        public boolean isListValue() {
            return listValue;
        }

        public String getTypeHandler() {
            return typeHandler;
        }

        protected Criterion(String condition) {
            super();
            this.condition = condition;
            this.typeHandler = null;
            this.noValue = true;
        }

        protected Criterion(String condition, Object value, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.typeHandler = typeHandler;
            if (value instanceof List<?>) {
                this.listValue = true;
            } else {
                this.singleValue = true;
            }
        }

        protected Criterion(String condition, Object value) {
            this(condition, value, null);
        }

        protected Criterion(String condition, Object value, Object secondValue, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.secondValue = secondValue;
            this.typeHandler = typeHandler;
            this.betweenValue = true;
        }

        protected Criterion(String condition, Object value, Object secondValue) {
            this(condition, value, secondValue, null);
        }
    }
}