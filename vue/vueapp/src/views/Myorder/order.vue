<!--html-->
<template>
  <div class="order">

      <Table :util="{
    httpUrl:'/register',
    params:'/list',//请求地址
    //id:'主键',
    name:'患者姓名',
    age:'生日/-1',
    aggg:'年龄/-1',
    statee:'状态/-1',
    birth:'就诊日期///日期',
  }" :curpage="1"></Table>

  </div>
</template>

<!--JavaScript-->
<script lang="js">
import {reactive, toRefs} from "vue";


export default {
  name: "order",
  components: {},

  setup() {
    let state = reactive({
      list: []
    })

    let data = reactive({
      list: []
    })

    let fun = () => {
      return 1;
    }

    return {
      ...state,
      ...toRefs(data),
    }
  }
}
</script>
<!--css-->
<style scoped lang="css">
.order {


}
</style>