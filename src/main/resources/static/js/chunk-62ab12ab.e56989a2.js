(window["webpackJsonp"]=window["webpackJsonp"]||[]).push([["chunk-62ab12ab"],{b39f:function(t,e,n){"use strict";n.d(e,"c",(function(){return s})),n.d(e,"a",(function(){return c})),n.d(e,"b",(function(){return o})),n.d(e,"d",(function(){return i}));var a=n("4ec3");function s(t){return Object(a["a"])("/biz/bizInfo/".concat(t),"get")}function i(t){return Object(a["a"])("/client/clientList","get",t)}function c(t){return Object(a["a"])("/client/confirmDuple/".concat(t),"get")}function o(t){return Object(a["a"])("/client","post",t)}},ec42:function(t,e,n){"use strict";n.r(e);var a=function(){var t=this,e=t.$createElement,n=t._self._c||e;return n("client-form")},s=[],i=function(){var t=this,e=t.$createElement,n=t._self._c||e;return n("div",{staticClass:"container admin-container"},[n("section",{staticClass:"section__contents"},[n("div",{staticClass:"inner-wrap"},[t._m(0),n("div",{staticClass:"component-area"},[n("div",{staticClass:"items-wrap"},[n("div",{staticClass:"component-box"},[t._m(1),n("div",{staticClass:"component-box-cnt"},[t.idDupleResult?n("div",{staticClass:"input-box"},[n("input",{directives:[{name:"model",rawName:"v-model",value:t.clientVO.clientNm,expression:"clientVO.clientNm"}],staticClass:"input",attrs:{type:"text",readonly:""},domProps:{value:t.clientVO.clientNm},on:{input:function(e){e.target.composing||t.$set(t.clientVO,"clientNm",e.target.value)}}}),n("button",{staticClass:"button",attrs:{type:"button"},on:{click:t.researchClientNm}},[t._v(" 재조회 ")])]):n("div",{staticClass:"input-box"},[n("input",{directives:[{name:"model",rawName:"v-model",value:t.clientVO.clientNm,expression:"clientVO.clientNm"}],ref:"clientNm",staticClass:"input ",attrs:{type:"text",placeholder:"입력하세요",maxlength:"150"},domProps:{value:t.clientVO.clientNm},on:{input:function(e){e.target.composing||t.$set(t.clientVO,"clientNm",e.target.value)}}}),n("button",{ref:"dupleBtn",staticClass:"button",attrs:{type:"button"},on:{click:t.confirmDuple}},[t._v(" 중복확인 ")])]),n("p",{staticClass:"msg-state"},[t._v(t._s(t.idDupleResultMsg))])])]),n("div",{staticClass:"component-box"},[t._m(2),n("div",{staticClass:"component-box-cnt"},[n("div",{staticClass:"input-box"},[n("select-box",{ref:"clientKind",attrs:{codeGroup:"clientKind"},on:{input:function(e){t.clientVO.clientKind=e}},model:{value:t.clientVO.clientKind,callback:function(e){t.$set(t.clientVO,"clientKind",e)},expression:"clientVO.clientKind"}})],1)])]),n("div",{staticClass:"component-box"},[t._m(3),n("div",{staticClass:"component-box-cnt"},[t.bizResearchFlag?n("div",{staticClass:"input-box"},[n("input",{directives:[{name:"model",rawName:"v-model",value:t.clientVO.bizNo,expression:"clientVO.bizNo"}],staticClass:"input",attrs:{type:"text",readonly:""},domProps:{value:t.clientVO.bizNo},on:{input:function(e){e.target.composing||t.$set(t.clientVO,"bizNo",e.target.value)}}}),n("button",{staticClass:"button",attrs:{type:"button"},on:{click:t.reSearchBizInfo}},[t._v(" 재 조회 ")])]):n("div",{staticClass:"input-box"},[n("input",{directives:[{name:"model",rawName:"v-model",value:t.clientVO.bizNo,expression:"clientVO.bizNo"}],ref:"bizNo",staticClass:"input ",attrs:{type:"text",placeholder:"입력해 주세요",maxlength:"12"},domProps:{value:t.clientVO.bizNo},on:{input:function(e){e.target.composing||t.$set(t.clientVO,"bizNo",e.target.value)}}}),n("button",{ref:"bizSearchBtn",staticClass:"button",attrs:{type:"button"},on:{click:t.searchBizInfo}},[t._v(" 휴/폐업 조회 ")])]),n("p",{staticClass:"msg-state"},[t._v(t._s(t.clientVO.bizResultMsg))])])]),n("div",{staticClass:"component-box"},[t._m(4),n("div",{staticClass:"component-box-cnt"},[n("div",{staticClass:"input-box"},[n("input",{directives:[{name:"model",rawName:"v-model",value:t.clientVO.ceoNm,expression:"clientVO.ceoNm"}],ref:"ceoNm",staticClass:"input",attrs:{type:"text",placeholder:"입력하세요",maxlength:"30"},domProps:{value:t.clientVO.ceoNm},on:{input:function(e){e.target.composing||t.$set(t.clientVO,"ceoNm",e.target.value)}}})])])]),n("div",{staticClass:"component-box"},[t._m(5),n("div",{staticClass:"component-box-cnt"},[n("div",{staticClass:"input-box"},[n("input",{directives:[{name:"model",rawName:"v-model",value:t.clientVO.coRegNo,expression:"clientVO.coRegNo"}],ref:"coRegNo",staticClass:"input",attrs:{type:"text",placeholder:"입력하세요",maxlength:"13"},domProps:{value:t.clientVO.coRegNo},on:{input:function(e){e.target.composing||t.$set(t.clientVO,"coRegNo",e.target.value)}}})])])]),n("div",{staticClass:"component-box"},[t._m(6),n("div",{staticClass:"component-box-cnt"},[n("div",{staticClass:"input-box"},[n("select-box",{ref:"bizCond",attrs:{codeGroup:"bizCond",codeFlag:!0},model:{value:t.clientVO.bizCond,callback:function(e){t.$set(t.clientVO,"bizCond",e)},expression:"clientVO.bizCond"}})],1)])]),n("div",{staticClass:"component-box"},[t._m(7),n("div",{staticClass:"component-box-cnt"},[n("div",{staticClass:"input-box"},[n("select-box",{ref:"bizCond",attrs:{codeGroup:"bizKind"},model:{value:t.clientVO.bizKind,callback:function(e){t.$set(t.clientVO,"bizKind",e)},expression:"clientVO.bizKind"}})],1)])]),n("select-box",{staticStyle:{display:"none"},attrs:{codeGroup:"contractStatus"},model:{value:t.clientVO.contractStatus,callback:function(e){t.$set(t.clientVO,"contractStatus",e)},expression:"clientVO.contractStatus"}}),n("div",{staticClass:"component-box"},[t._m(8),n("div",{staticClass:"component-box-cnt"},[n("div",{staticClass:"input-box"},[n("input",{directives:[{name:"model",rawName:"v-model",value:t.clientVO.addr,expression:"clientVO.addr"}],staticClass:"input",attrs:{type:"text",readonly:""},domProps:{value:t.clientVO.addr},on:{input:function(e){e.target.composing||t.$set(t.clientVO,"addr",e.target.value)}}}),n("button",{staticClass:"button",attrs:{type:"button"},on:{click:function(e){return t.openPostData()}}},[t._v("주소 검색")])]),n("div",{staticClass:"input-box"},[n("input",{directives:[{name:"model",rawName:"v-model",value:t.clientVO.addrDetail,expression:"clientVO.addrDetail"}],ref:"addrDetail",staticClass:"input",attrs:{type:"text",placeholder:"상세주소"},domProps:{value:t.clientVO.addrDetail},on:{input:function(e){e.target.composing||t.$set(t.clientVO,"addrDetail",e.target.value)}}})])])]),n("div",{staticClass:"component-box"},[t._m(9),n("div",{staticClass:"component-box-cnt"},[n("div",{staticClass:"input-box"},[n("input",{directives:[{name:"model",rawName:"v-model",value:t.clientVO.telNo,expression:"clientVO.telNo"}],ref:"telNo",staticClass:"input",attrs:{type:"text",placeholder:"입력하세요",maxlength:"11"},domProps:{value:t.clientVO.telNo},on:{input:function(e){e.target.composing||t.$set(t.clientVO,"telNo",e.target.value)}}})])])]),n("div",{staticClass:"component-box"},[t._m(10),n("div",{staticClass:"component-box-cnt"},[n("div",{staticClass:"input-box"},[n("input",{directives:[{name:"model",rawName:"v-model",value:t.clientVO.manager,expression:"clientVO.manager"}],ref:"manager",staticClass:"input",attrs:{type:"text",placeholder:"입력하세요",maxlength:"15"},domProps:{value:t.clientVO.manager},on:{input:function(e){e.target.composing||t.$set(t.clientVO,"manager",e.target.value)}}})])])]),n("div",{staticClass:"component-box"},[t._m(11),n("div",{staticClass:"component-box-cnt"},[n("div",{staticClass:"input-box"},[n("input",{directives:[{name:"model",rawName:"v-model",value:t.clientVO.phone,expression:"clientVO.phone"}],ref:"phone",staticClass:"input",attrs:{type:"text",placeholder:"입력하세요",maxlength:"11"},domProps:{value:t.clientVO.phone},on:{input:function(e){e.target.composing||t.$set(t.clientVO,"phone",e.target.value)}}})])])]),n("div",{staticClass:"component-box"},[t._m(12),n("div",{staticClass:"component-box-cnt"},[n("div",{staticClass:"input-box"},[n("input",{directives:[{name:"model",rawName:"v-model",value:t.clientVO.email,expression:"clientVO.email"}],ref:"email",staticClass:"input",attrs:{type:"text",placeholder:"입력하세요",maxlength:"50"},domProps:{value:t.clientVO.email},on:{input:function(e){e.target.composing||t.$set(t.clientVO,"email",e.target.value)}}})])])]),n("div",{staticClass:"component-box"},[t._m(13),n("div",{staticClass:"component-box-cnt"},[n("div",{staticClass:"input-box"},[n("input",{directives:[{name:"model",rawName:"v-model",value:t.clientVO.contractAmt,expression:"clientVO.contractAmt"}],ref:"contractAmt",staticClass:"input",attrs:{type:"text",placeholder:"입력하세요",maxlength:"9"},domProps:{value:t.clientVO.contractAmt},on:{input:function(e){e.target.composing||t.$set(t.clientVO,"contractAmt",e.target.value)}}})])])]),n("div",{staticClass:"component-box"},[t._m(14),n("div",{staticClass:"component-box-cnt"},[n("div",{staticClass:"input-term"},[n("div",{staticClass:"input-box"},[[n("div",{staticClass:"block"},[n("el-date-picker",{ref:"contractDateFrom",attrs:{type:"date",placeholder:"Pick a day",format:"yyyy-MM-dd"},model:{value:t.contractDateFrom,callback:function(e){t.contractDateFrom=e},expression:"contractDateFrom"}})],1)]],2),n("p",[t._v("~")]),n("div",{staticClass:"input-box"},[[n("div",{staticClass:"block"},[n("el-date-picker",{ref:"contractDateTo",attrs:{type:"date",placeholder:"Pick a day",format:"yyyy-MM-dd"},model:{value:t.contractDateTo,callback:function(e){t.contractDateTo=e},expression:"contractDateTo"}})],1)]],2)])])])],1)]),n("div",{staticClass:"buttons-complete"},[n("div",{staticClass:"buttons"},[n("button",{staticClass:"button button__save",attrs:{type:"submit"},on:{click:t.saveClient}},[t._v("등록")]),n("button",{staticClass:"button button__cancel",attrs:{type:"button"}},[t._v("취소")])])])])]),n("div",{staticClass:"popup",class:{show:t.openPostFlag}},[n("div",{staticClass:"component-area"},[t._m(15),t.openPostFlag?n("div",[n("vue-daum-postcode",{on:{complete:function(e){return t.getPostData(e)}}})],1):t._e(),n("button",{staticClass:"button__close",attrs:{type:"button"},on:{click:t.closeModal}},[n("span",{staticClass:"icon icon-close"}),n("span",{staticClass:"blind"},[t._v("닫기")])])])])])},c=[function(){var t=this,e=t.$createElement,n=t._self._c||e;return n("div",{staticClass:"section-top"},[n("h3",{staticClass:"section__title"},[t._v("고객사 등록")])])},function(){var t=this,e=t.$createElement,n=t._self._c||e;return n("div",{staticClass:"component-box-top"},[n("p",{staticClass:"component__title"},[t._v("거래처명")])])},function(){var t=this,e=t.$createElement,n=t._self._c||e;return n("div",{staticClass:"component-box-top"},[n("p",{staticClass:"component__title"},[t._v("거래처 종류")])])},function(){var t=this,e=t.$createElement,n=t._self._c||e;return n("div",{staticClass:"component-box-top"},[n("p",{staticClass:"component__title"},[t._v("사업자번호")])])},function(){var t=this,e=t.$createElement,n=t._self._c||e;return n("div",{staticClass:"component-box-top"},[n("p",{staticClass:"component__title"},[t._v("대표자명")])])},function(){var t=this,e=t.$createElement,n=t._self._c||e;return n("div",{staticClass:"component-box-top"},[n("p",{staticClass:"component__title"},[t._v("법인등록번호")])])},function(){var t=this,e=t.$createElement,n=t._self._c||e;return n("div",{staticClass:"component-box-top"},[n("p",{staticClass:"component__title"},[t._v("업태")])])},function(){var t=this,e=t.$createElement,n=t._self._c||e;return n("div",{staticClass:"component-box-top"},[n("p",{staticClass:"component__title"},[t._v("업종")])])},function(){var t=this,e=t.$createElement,n=t._self._c||e;return n("div",{staticClass:"component-box-top"},[n("p",{staticClass:"component__title"},[t._v("주소")])])},function(){var t=this,e=t.$createElement,n=t._self._c||e;return n("div",{staticClass:"component-box-top"},[n("p",{staticClass:"component__title"},[t._v("대표 전화번호")])])},function(){var t=this,e=t.$createElement,n=t._self._c||e;return n("div",{staticClass:"component-box-top"},[n("p",{staticClass:"component__title"},[t._v("담당자")])])},function(){var t=this,e=t.$createElement,n=t._self._c||e;return n("div",{staticClass:"component-box-top"},[n("p",{staticClass:"component__title"},[t._v("휴대전화")])])},function(){var t=this,e=t.$createElement,n=t._self._c||e;return n("div",{staticClass:"component-box-top"},[n("p",{staticClass:"component__title"},[t._v("E-Mail")])])},function(){var t=this,e=t.$createElement,n=t._self._c||e;return n("div",{staticClass:"component-box-top"},[n("p",{staticClass:"component__title"},[t._v("계약금액")])])},function(){var t=this,e=t.$createElement,n=t._self._c||e;return n("div",{staticClass:"component-box-top"},[n("p",{staticClass:"component__title"},[t._v("계약기간")])])},function(){var t=this,e=t.$createElement,n=t._self._c||e;return n("div",{staticClass:"popup-top"},[n("strong",{staticClass:"popup__title"},[t._v("주소 검색")])])}],o=(n("c975"),n("ac1f"),n("5319"),n("96cf"),n("1da1")),r=function(){var t=this,e=t.$createElement,n=t._self._c||e;return t.codeFlag?n("select",{staticClass:"input-select",on:{input:function(e){return t.updateVal(e.target.value)}}},t._l(t.codeList,(function(e){return n("option",{key:e.codeId,domProps:{value:e.codeId}},[t._v(t._s(e.code+"("+e.codeNm+")-"+e.codeInfo)+" ")])})),0):n("select",{staticClass:"input-select",on:{input:function(e){return t.updateVal(e.target.value)}}},t._l(t.codeList,(function(e){return n("option",{key:e.codeId,domProps:{value:e.codeId}},[t._v(t._s(e.codeNm)+" ")])})),0)},l=[],u=n("4ec3");function p(t){return Object(u["a"])("/common/code/".concat(t),"get")}var d={created:function(){this.getCode()},props:["codeGroup","codeFlag"],methods:{getCode:function(){var t=this;return Object(o["a"])(regeneratorRuntime.mark((function e(){var n;return regeneratorRuntime.wrap((function(e){while(1)switch(e.prev=e.next){case 0:return e.next=2,p(t.codeGroup);case 2:n=e.sent,t.codeList=n.data[t.codeGroup],t.codeList.length>0&&t.$emit("input",t.codeList[0].code);case 5:case"end":return e.stop()}}),e)})))()},updateVal:function(t){this.$emit("input",t)}},data:function(){return{codeList:[]}}},m=d,v=n("2877"),b=Object(v["a"])(m,r,l,!1,null,null,null),f=b.exports,g=n("b39f"),C={data:function(){return{idDupleResult:!1,idDupleResultMsg:"거래처명 중복 체크를 해 주세요.",bizResearchFlag:!1,contractDateFrom:new Date,contractDateTo:new Date,clientVO:{contractAmt:0,bizResultMsg:"",address:"",crtId:this.$store.getters.getUserId},openPostFlag:!1}},watch:{contractDateFrom:function(t,e){if(t>this.contractDateTo)return this.sAlert("계약 시작일은 계약 종료일보다 클 수 없습니다."),void(this.contractDateFrom=e)},contractDateTo:function(t,e){if(t<this.contractDateFrom)return this.sAlert("계약 종료일은 계약 시작일보다 작을 수 없습니다."),void(this.contractDateTo=e)}},components:{SelectBox:f},methods:{getPostData:function(t){console.log(t),this.openPostFlag=!1,this.clientVO.postNo=t.zonecode,this.clientVO.addr=t.address,this.clientVO.addrEng=t.addressEnglish,this.clientVO.addrType=t.addressType,this.clientVO.apartYn=t.apartment,this.clientVO.roadNm=t.roadname,this.clientVO.roadNmCd=t.roadnameCode,this.clientVO.bcode=t.bcode,this.clientVO.bname=t.bname,this.clientVO.buildingCd=t.buildingCode,this.clientVO.buildingNm=t.buildingName,this.clientVO.sido=t.sido,this.clientVO.sigungu=t.sigungu,this.clientVO.sigunguCd=t.sigunguCode},openPostData:function(){this.openPostFlag=!0},closeModal:function(){this.openPostFlag=!1},searchBizInfo:function(){var t=this;return Object(o["a"])(regeneratorRuntime.mark((function e(){var n,a;return regeneratorRuntime.wrap((function(e){while(1)switch(e.prev=e.next){case 0:if(t.clientVO.bizNo){e.next=3;break}return t.sAlert("사업자번호를 입력해 주세요."),e.abrupt("return");case 3:if(n=t.clientVO.bizNo,-1!=n.indexOf("-")&&n.replace(/-/gi,""),t.checkBizNo(n)){e.next=8;break}return t.sAlert("사업자번호가 유효하지 않습니다."),e.abrupt("return");case 8:return e.next=10,Object(g["c"])(n);case 10:a=e.sent,0==a.result&&(t.clientVO.bizResultMsg=a.data.resultMsg,t.clientVO.bizResultDetailMsg=a.data.detailMsg,t.clientVO.bizResultDetailEngMsg=a.data.detailMsgEngl,t.bizResearchFlag=!0);case 12:case"end":return e.stop()}}),e)})))()},confirmDuple:function(){var t=this;return Object(o["a"])(regeneratorRuntime.mark((function e(){var n;return regeneratorRuntime.wrap((function(e){while(1)switch(e.prev=e.next){case 0:if(t.clientVO.clientNm){e.next=4;break}return t.sAlert("거래처 명을 입력해 주세요"),t.$refs.clientNm.focus(),e.abrupt("return");case 4:return e.next=6,Object(g["a"])(t.clientVO.clientNm);case 6:n=e.sent,0==n.result?t.idDupleResult=!0:t.idDupleResult=!1,t.idDupleResultMsg=n.resultMsg;case 9:case"end":return e.stop()}}),e)})))()},researchClientNm:function(){this.idDupleResult=!1,this.idDupleResultMsg="거래처명 중복 체크를 해 주세요."},reSearchBizInfo:function(){this.bizResearchFlag=!1,this.clientVO.bizResultMsg=""},saveClient:function(){var t=this;return Object(o["a"])(regeneratorRuntime.mark((function e(){return regeneratorRuntime.wrap((function(e){while(1)switch(e.prev=e.next){case 0:t.sConfirm("등록하시겠습니까?",Object(o["a"])(regeneratorRuntime.mark((function e(){var n;return regeneratorRuntime.wrap((function(e){while(1)switch(e.prev=e.next){case 0:if(t.idDupleResult){e.next=6;break}return t.sAlert("거래처명 중복 체크를 진행해 주세요."),t.$refs.dupleBtn.focus(),e.abrupt("return");case 6:if(t.bizResearchFlag){e.next=12;break}return t.sAlert("사업자 휴/폐업 조회를 진행해 주세요."),t.$refs.bizSearchBtn.focus(),e.abrupt("return");case 12:if(t.clientVO.ceoNm){e.next=18;break}return t.sAlert("대표자 명을 입력해 주세요."),t.$refs.ceoNm.focus(),e.abrupt("return");case 18:if(t.clientVO.coRegNo){e.next=24;break}return t.sAlert("법인 등록 번호를 입력해 주세요."),t.$refs.bizRegNo.focus(),e.abrupt("return");case 24:if(t.clientVO.postNo){e.next=30;break}return t.sAlert("주소를 입력해 주세요."),t.$refs.postSearch.focus(),e.abrupt("return");case 30:if(t.clientVO.addrDetail){e.next=36;break}return t.sAlert("상세 주소를 입력해 주세요."),t.$refs.addrDetail.focus(),e.abrupt("return");case 36:if(t.clientVO.telNo){e.next=42;break}return t.sAlert("대표 전화번호를 입력해 주세요."),t.$refs.telNo.focus(),e.abrupt("return");case 42:if(t.clientVO.manager){e.next=48;break}return t.sAlert("담당자를 입력해 주세요"),t.$refs.manager.focus(),e.abrupt("return");case 48:if(t.clientVO.phone){e.next=54;break}return t.sAlert("휴대전화 번호를 입력해 주세요."),t.$refs.phone.focus(),e.abrupt("return");case 54:if(t.clientVO.email){e.next=60;break}return t.sAlert("이메일을 입력해 주세요."),t.$refs.email.focus(),e.abrupt("return");case 60:if(t.clientVO.contractAmt&&!(t.clientVO.contractAmt<1)){e.next=66;break}return t.sAlert("계약금액을 입력해 주세요."),t.$refs.contractAmt.focus(),e.abrupt("return");case 66:if(t.contractDateFrom){e.next=72;break}return t.sAlert("계약 기간 시작일자를 입력해 주세요."),t.$refs.contractDateFrom.focus(),e.abrupt("return");case 72:if(t.contractDateTo){e.next=76;break}return t.sAlert("계약 기간 종료 일자를 입력해 주세요."),t.$refs.contractDateTo.focus(),e.abrupt("return");case 76:return-1!=t.clientVO.bizNo.indexOf("-")&&(t.clientVO.bizNo=t.clientVO.bizNo.replace(/-/gi,"")),t.clientVO.contractDateFrom=t.formatDate(t.contractDateFrom),t.clientVO.contractDateTo=t.formatDate(t.contractDateTo),e.next=81,Object(g["b"])(t.clientVO);case 81:n=e.sent,console.log(n),0==n.result&&t.sAlert(n.resultMsg);case 84:case"end":return e.stop()}}),e)}))));case 1:case"end":return e.stop()}}),e)})))()}}},x=C,_=Object(v["a"])(x,i,c,!1,null,null,null),O=_.exports,h={components:{ClientForm:O}},V=h,N=Object(v["a"])(V,a,s,!1,null,null,null);e["default"]=N.exports}}]);
//# sourceMappingURL=chunk-62ab12ab.e56989a2.js.map