<!--html-->
<template>
  <div class="Category">
    <Table :util="{
    httpUrl:'/category',
    params:'',//请求地址
    //id:'主键',
    category:'药品类别',
  }"></Table>
  </div>
</template>

<!--JavaScript-->
<script lang="js">
import {reactive, toRefs} from "vue";


export default {
  name: "Category",
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
.Category {


}
</style>