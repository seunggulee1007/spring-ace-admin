(window["webpackJsonp"]=window["webpackJsonp"]||[]).push([["chunk-2d230492"],{ec42:function(t,e,n){"use strict";n.r(e);var s=function(){var t=this,e=t.$createElement,n=t._self._c||e;return n("client-form")},i=[],a=function(){var t=this,e=t.$createElement,n=t._self._c||e;return n("div",{staticClass:"container admin-container"},[n("section",{staticClass:"section__contents"},[n("div",{staticClass:"inner-wrap"},[t._m(0),n("div",{staticClass:"component-area"},[n("div",{staticClass:"items-wrap"},[n("div",{staticClass:"component-box"},[t._m(1),n("div",{staticClass:"component-box-cnt"},[n("div",{staticClass:"input-box"},[n("input",{directives:[{name:"model",rawName:"v-model",value:t.clientVO.clientNm,expression:"clientVO.clientNm"}],ref:"clientNm",staticClass:"input ",attrs:{type:"text",placeholder:"입력하세요",maxlength:"150"},domProps:{value:t.clientVO.clientNm},on:{input:function(e){e.target.composing||t.$set(t.clientVO,"clientNm",e.target.value)}}}),n("button",{staticClass:"button",attrs:{type:"button"},on:{click:t.confirmDuple}},[t._v("중복확인")])]),t.idDupleResult?t._e():n("p",{staticClass:"msg-state"},[t._v(t._s(t.idDupleResultMsg))])])]),n("div",{staticClass:"component-box"},[t._m(2),n("div",{staticClass:"component-box-cnt"},[n("div",{staticClass:"input-box"},[n("select",{directives:[{name:"model",rawName:"v-model",value:t.clientVO.clientKind,expression:"clientVO.clientKind"}],ref:"clientKind",staticClass:"input-select",on:{change:function(e){var n=Array.prototype.filter.call(e.target.options,(function(t){return t.selected})).map((function(t){var e="_value"in t?t._value:t.value;return e}));t.$set(t.clientVO,"clientKind",e.target.multiple?n:n[0])}}},[n("option",{attrs:{value:"",selected:""}},[t._v("선택하세요")]),n("option",{attrs:{value:""}},[t._v("1")]),n("option",{attrs:{value:""}},[t._v("2")]),n("option",{attrs:{value:""}},[t._v("3")])])])])]),n("div",{staticClass:"component-box"},[t._m(3),n("div",{staticClass:"component-box-cnt"},[n("div",{staticClass:"input-box"},[n("input",{directives:[{name:"model",rawName:"v-model",value:t.clientVO.bizNo,expression:"clientVO.bizNo"}],ref:"bizNo",staticClass:"input ",attrs:{type:"text",placeholder:"하이픈(-) 없이 입력하세요",maxlength:"10"},domProps:{value:t.clientVO.bizNo},on:{input:function(e){e.target.composing||t.$set(t.clientVO,"bizNo",e.target.value)}}}),n("button",{staticClass:"button",attrs:{type:"button"},on:{click:t.searchBizInfo}},[t._v("휴/폐업 조회")]),n("button",{staticClass:"button",attrs:{type:"button"},on:{click:t.reSearchBizInfo}},[t._v("재 조회")])]),n("p",{staticClass:"msg-state"},[t._v(t._s(t.clientVO.bizResultMsg))])])]),n("div",{staticClass:"component-box"},[t._m(4),n("div",{staticClass:"component-box-cnt"},[n("div",{staticClass:"input-box"},[n("input",{directives:[{name:"model",rawName:"v-model",value:t.clientVO.ceoNm,expression:"clientVO.ceoNm"}],ref:"ceoNm",staticClass:"input",attrs:{type:"text",placeholder:"입력하세요",maxlength:"30"},domProps:{value:t.clientVO.ceoNm},on:{input:function(e){e.target.composing||t.$set(t.clientVO,"ceoNm",e.target.value)}}})])])]),n("div",{staticClass:"component-box"},[t._m(5),n("div",{staticClass:"component-box-cnt"},[n("div",{staticClass:"input-box"},[n("input",{directives:[{name:"model",rawName:"v-model",value:t.clientVO.coRegNo,expression:"clientVO.coRegNo"}],ref:"coRegNo",staticClass:"input",attrs:{type:"text",placeholder:"입력하세요",maxlength:"13"},domProps:{value:t.clientVO.coRegNo},on:{input:function(e){e.target.composing||t.$set(t.clientVO,"coRegNo",e.target.value)}}})])])]),n("div",{staticClass:"component-box"},[t._m(6),n("div",{staticClass:"component-box-cnt"},[n("div",{staticClass:"input-box"},[n("input",{directives:[{name:"model",rawName:"v-model",value:t.clientVO.bizCond,expression:"clientVO.bizCond"}],ref:"bizCond",staticClass:"input",attrs:{type:"text",placeholder:"입력하세요",maxlength:"150"},domProps:{value:t.clientVO.bizCond},on:{input:function(e){e.target.composing||t.$set(t.clientVO,"bizCond",e.target.value)}}})])])]),n("div",{staticClass:"component-box"},[t._m(7),n("div",{staticClass:"component-box-cnt"},[n("div",{staticClass:"input-box"},[n("input",{directives:[{name:"model",rawName:"v-model",value:t.clientVO.bizKind,expression:"clientVO.bizKind"}],ref:"bizKind",staticClass:"input",attrs:{type:"text",placeholder:"입력하세요",maxlength:"150"},domProps:{value:t.clientVO.bizKind},on:{input:function(e){e.target.composing||t.$set(t.clientVO,"bizKind",e.target.value)}}})])])]),n("div",{staticClass:"component-box"},[t._m(8),n("div",{staticClass:"component-box-cnt"},[n("div",{staticClass:"input-box"},[n("input",{staticClass:"input",attrs:{type:"text",readonly:""}}),n("button",{staticClass:"button",attrs:{type:"button"},on:{click:function(e){return t.openPostData()}}},[t._v("주소 검색")])]),n("div",{staticClass:"input-box"},[n("input",{directives:[{name:"model",rawName:"v-model",value:t.clientVO.addrDetail,expression:"clientVO.addrDetail"}],staticClass:"input",attrs:{type:"text",placeholder:"상세주소"},domProps:{value:t.clientVO.addrDetail},on:{input:function(e){e.target.composing||t.$set(t.clientVO,"addrDetail",e.target.value)}}})])])]),n("div",{staticClass:"component-box"},[t._m(9),n("div",{staticClass:"component-box-cnt"},[n("div",{staticClass:"input-box"},[n("input",{directives:[{name:"model",rawName:"v-model",value:t.clientVO.telNo,expression:"clientVO.telNo"}],staticClass:"input",attrs:{type:"text",placeholder:"입력하세요",maxlength:"11"},domProps:{value:t.clientVO.telNo},on:{input:function(e){e.target.composing||t.$set(t.clientVO,"telNo",e.target.value)}}})])])]),n("div",{staticClass:"component-box"},[t._m(10),n("div",{staticClass:"component-box-cnt"},[n("div",{staticClass:"input-box"},[n("input",{directives:[{name:"model",rawName:"v-model",value:t.clientVO.manager,expression:"clientVO.manager"}],staticClass:"input",attrs:{type:"text",placeholder:"입력하세요",maxlength:"15"},domProps:{value:t.clientVO.manager},on:{input:function(e){e.target.composing||t.$set(t.clientVO,"manager",e.target.value)}}})])])]),n("div",{staticClass:"component-box"},[t._m(11),n("div",{staticClass:"component-box-cnt"},[n("div",{staticClass:"input-box"},[n("input",{directives:[{name:"model",rawName:"v-model",value:t.clientVO.phone,expression:"clientVO.phone"}],staticClass:"input",attrs:{type:"text",placeholder:"입력하세요",maxlength:"11"},domProps:{value:t.clientVO.phone},on:{input:function(e){e.target.composing||t.$set(t.clientVO,"phone",e.target.value)}}})])])]),n("div",{staticClass:"component-box"},[t._m(12),n("div",{staticClass:"component-box-cnt"},[n("div",{staticClass:"input-box"},[n("input",{directives:[{name:"model",rawName:"v-model",value:t.clientVO.email,expression:"clientVO.email"}],staticClass:"input",attrs:{type:"text",placeholder:"입력하세요",maxlength:"50"},domProps:{value:t.clientVO.email},on:{input:function(e){e.target.composing||t.$set(t.clientVO,"email",e.target.value)}}})])])]),n("div",{staticClass:"component-box"},[t._m(13),n("div",{staticClass:"component-box-cnt"},[n("div",{staticClass:"input-box"},[n("input",{directives:[{name:"model",rawName:"v-model",value:t.clientVO.contractAmt,expression:"clientVO.contractAmt"}],staticClass:"input",attrs:{type:"text",placeholder:"입력하세요",maxlength:"9"},domProps:{value:t.clientVO.contractAmt},on:{input:function(e){e.target.composing||t.$set(t.clientVO,"contractAmt",e.target.value)}}})])])]),t._m(14)])]),t._m(15)])]),n("div",{staticClass:"popup",class:{show:t.openPostFlag}},[n("div",{staticClass:"component-area"},[t._m(16),t.openPostFlag?n("div",[n("vue-daum-postcode",{on:{complete:function(e){return t.getPostData(e)}}})],1):t._e(),n("button",{staticClass:"button__close",attrs:{type:"button"},on:{click:t.closeModal}},[n("span",{staticClass:"icon icon-close"}),n("span",{staticClass:"blind"},[t._v("닫기")])])])])])},o=[function(){var t=this,e=t.$createElement,n=t._self._c||e;return n("div",{staticClass:"section-top"},[n("h3",{staticClass:"section__title"},[t._v("고객사 등록")])])},function(){var t=this,e=t.$createElement,n=t._self._c||e;return n("div",{staticClass:"component-box-top"},[n("p",{staticClass:"component__title"},[t._v("거래처명")])])},function(){var t=this,e=t.$createElement,n=t._self._c||e;return n("div",{staticClass:"component-box-top"},[n("p",{staticClass:"component__title"},[t._v("거래처 종류")])])},function(){var t=this,e=t.$createElement,n=t._self._c||e;return n("div",{staticClass:"component-box-top"},[n("p",{staticClass:"component__title"},[t._v("사업자번호")])])},function(){var t=this,e=t.$createElement,n=t._self._c||e;return n("div",{staticClass:"component-box-top"},[n("p",{staticClass:"component__title"},[t._v("대표자명")])])},function(){var t=this,e=t.$createElement,n=t._self._c||e;return n("div",{staticClass:"component-box-top"},[n("p",{staticClass:"component__title"},[t._v("법인등록번호")])])},function(){var t=this,e=t.$createElement,n=t._self._c||e;return n("div",{staticClass:"component-box-top"},[n("p",{staticClass:"component__title"},[t._v("업태")])])},function(){var t=this,e=t.$createElement,n=t._self._c||e;return n("div",{staticClass:"component-box-top"},[n("p",{staticClass:"component__title"},[t._v("업종")])])},function(){var t=this,e=t.$createElement,n=t._self._c||e;return n("div",{staticClass:"component-box-top"},[n("p",{staticClass:"component__title"},[t._v("주소")])])},function(){var t=this,e=t.$createElement,n=t._self._c||e;return n("div",{staticClass:"component-box-top"},[n("p",{staticClass:"component__title"},[t._v("대표 전화번호")])])},function(){var t=this,e=t.$createElement,n=t._self._c||e;return n("div",{staticClass:"component-box-top"},[n("p",{staticClass:"component__title"},[t._v("담당자")])])},function(){var t=this,e=t.$createElement,n=t._self._c||e;return n("div",{staticClass:"component-box-top"},[n("p",{staticClass:"component__title"},[t._v("휴대전화")])])},function(){var t=this,e=t.$createElement,n=t._self._c||e;return n("div",{staticClass:"component-box-top"},[n("p",{staticClass:"component__title"},[t._v("E-Mail")])])},function(){var t=this,e=t.$createElement,n=t._self._c||e;return n("div",{staticClass:"component-box-top"},[n("p",{staticClass:"component__title"},[t._v("계약금액")])])},function(){var t=this,e=t.$createElement,n=t._self._c||e;return n("div",{staticClass:"component-box"},[n("div",{staticClass:"component-box-top"},[n("p",{staticClass:"component__title"},[t._v("계약기간")])]),n("div",{staticClass:"component-box-cnt"},[n("div",{staticClass:"input-term"},[n("div",{staticClass:"input-box"},[n("input",{staticClass:"input",attrs:{type:"text",placeholder:"시작일",readonly:""}}),n("button",{staticClass:"button__calendar",attrs:{type:"button"}},[n("span",{staticClass:"icon icon-calendar"}),n("span",{staticClass:"blind"},[t._v("날짜 선택")])])]),n("p",[t._v("~")]),n("div",{staticClass:"input-box"},[n("input",{staticClass:"input",attrs:{type:"text",placeholder:"종료일",readonly:""}}),n("button",{staticClass:"button__calendar",attrs:{type:"button"}},[n("span",{staticClass:"icon icon-calendar"}),n("span",{staticClass:"blind"},[t._v("날짜 선택")])])])])])])},function(){var t=this,e=t.$createElement,n=t._self._c||e;return n("div",{staticClass:"buttons-complete"},[n("div",{staticClass:"buttons"},[n("button",{staticClass:"button button__save",attrs:{type:"submit"}},[t._v("등록")]),n("button",{staticClass:"button button__cancel",attrs:{type:"button"}},[t._v("취소")])])])},function(){var t=this,e=t.$createElement,n=t._self._c||e;return n("div",{staticClass:"popup-top"},[n("strong",{staticClass:"popup__title"},[t._v("주소 검색")])])}],c=(n("96cf"),n("1da1")),l=n("4ec3");function r(t){return Object(l["a"])("/biz/bizInfo/".concat(t),"get")}var p={data:function(){return{idDupleResult:!1,idDupleResultMsg:"거래처명 중복 체크를 해 주세요.",clientVO:{clientNm:"",clientKind:"",bizNo:"",bizResultMsg:"",bizResultEngMsg:"",bizResult:"",ceoNm:"",coRegNo:"",bizCond:"",bizKind:"",postNo:"",addr:"",addrEng:"",addrType:"",addrDetail:"",buildingCd:"",buildingNm:"",sido:"",sigungu:"",sigunguCd:"",telNo:"",manager:"",phone:"",contractAmt:0,email:""},openPostFlag:!1}},methods:{getPostData:function(t){console.log(t),this.openPostFlag=!1},openPostData:function(){this.openPostFlag=!0},closeModal:function(){this.openPostFlag=!1},searchBizInfo:function(){var t=this;return Object(c["a"])(regeneratorRuntime.mark((function e(){var n;return regeneratorRuntime.wrap((function(e){while(1)switch(e.prev=e.next){case 0:if(t.clientVO.bizNo){e.next=3;break}return t.sAlert("사업자번호를 입력해 주세요."),e.abrupt("return");case 3:if(t.checkBizNo(t.clientVO.bizNo)){e.next=6;break}return t.sAlert("사업자번호가 유효하지 않습니다."),e.abrupt("return");case 6:return e.next=8,r(t.clientVO.bizNo);case 8:n=e.sent,0==n.result&&(t.clientVO.bizResultMsg=n.data.resultMsg,t.clientVO.bizResultDetailMsg=n.data.detailMsg,t.clientVO.bizResultDetailEngMsg=n.data.detailMsgEngl),console.log(n);case 11:case"end":return e.stop()}}),e)})))()},confirmDuple:function(){if(!this.clientNm)return this.sAlert("거래처 명을 입력해 주세요"),void this.$refs.clientNm.focus()},reSearchBizInfo:function(){}}},u=p,m=n("2877"),d=Object(m["a"])(u,a,o,!1,null,null,null),v=d.exports,_={components:{ClientForm:v}},b=_,C=Object(m["a"])(b,s,i,!1,null,null,null);e["default"]=C.exports}}]);
//# sourceMappingURL=chunk-2d230492.0adb17e1.js.map